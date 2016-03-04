package org.hisrc.airmeet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import org.hisrc.airmeet.gms.gcm.SubscribeToTopicTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FlightSearchActivity extends AppCompatActivity  {


    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final static String TAG = FlightSearchActivity.class.getName();

    private BroadcastReceiver mRegistrationBroadcastReceiver;
    private boolean isReceiverRegistered;

    // UI references.
    private EditText mFlightNumber;
    private DatePicker mDepartureDate;
    private Button mSubscribeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_search);
        mFlightNumber = (EditText) findViewById(R.id.edit_text_flight_number);
        mDepartureDate = (DatePicker) findViewById(R.id.date_picker_departure_date);

        Button mSubscribeButton = (Button) findViewById(R.id.button_subscribe);
        mSubscribeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, mDepartureDate.getYear());
                calendar.set(Calendar.MONTH, mDepartureDate.getMonth());
                calendar.set(Calendar.DAY_OF_MONTH, mDepartureDate.getDayOfMonth());
                String departureDate = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
                String flightNumber = mFlightNumber.getText().toString();

                String topic = "/topics/Flight-" + flightNumber.toUpperCase() + "-" + departureDate;
                new SubscribeToTopicTask(FlightSearchActivity.this).execute(topic);

                Log.i(TAG, "Trying to subscribe to [" + topic + "].");
            }
        });

        mRegistrationBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                SharedPreferences sharedPreferences =
                        PreferenceManager.getDefaultSharedPreferences(context);
                boolean sentToken = sharedPreferences
                        .getBoolean(AirmeetPreferences.SENT_TOKEN_TO_SERVER, false);
                if (sentToken) {
//                    mInformationTextView.setText(getString(R.string.gcm_send_message));
                } else {
//                    mInformationTextView.setText(getString(R.string.token_error_message));
                }
            }
        };

        // Registering BroadcastReceiver
        registerReceiver();

        if (checkPlayServices()) {
            // Start IntentService to register this application with GCM.
            Intent intent = new Intent(this, RegistrationIntentService.class);
            startService(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver();
    }

    @Override
    protected void onPause() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mRegistrationBroadcastReceiver);
        isReceiverRegistered = false;
        super.onPause();
    }

    private void registerReceiver(){
        if(!isReceiverRegistered) {
            LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                    new IntentFilter(AirmeetPreferences.REGISTRATION_COMPLETE));
            isReceiverRegistered = true;
        }
    }
    /**
     * Check the device to make sure it has the Google Play Services APK. If
     * it doesn't, display a dialog that allows users to download the APK from
     * the Google Play Store or enable it in the device's system settings.
     */
    private boolean checkPlayServices() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
                apiAvailability.getErrorDialog(this, resultCode, PLAY_SERVICES_RESOLUTION_REQUEST)
                        .show();
            } else {
                Log.i(TAG, "This device is not supported.");
                finish();
            }
            return false;
        }
        return true;
    }

}