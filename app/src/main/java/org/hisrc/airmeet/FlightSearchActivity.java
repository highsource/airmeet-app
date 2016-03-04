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
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import org.hisrc.airmeet.flight.model.FlightId;
import org.hisrc.airmeet.flight.task.SearchFlightInfoTask;
import org.joda.time.LocalDate;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.MessageFormat;

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
                final String flightNumber = mFlightNumber.getText().toString().toUpperCase();
                final LocalDate departureDate = new LocalDate(mDepartureDate.getYear(), mDepartureDate.getMonth() + 1, mDepartureDate.getDayOfMonth());
                searchFlight(flightNumber, departureDate);
            }
        });

        mRegistrationBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                SharedPreferences sharedPreferences =
                        PreferenceManager.getDefaultSharedPreferences(context);
                boolean sentToken = sharedPreferences
                        .getBoolean(AirmeetPreferences.SENT_TOKEN_TO_SERVER, false);
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

    private void searchFlight(final String flightNumber, final LocalDate departureDate) {
        final FlightId flightId = new FlightId(flightNumber, departureDate);
        new SearchFlightInfoTask(FlightSearchActivity.this){
            @Override
            protected void onPostExecute(JSONObject flightJSON) {
                if (flightJSON ==null)
                {
                    onFlightNotFound(flightNumber, departureDate);
                }
                else
                {
                    onFlightFound(flightJSON);
                }
            }
        }.execute(flightId);
    }

    private void onFlightFound(JSONObject flightJSON) {
        try {
            String departureAirportCode = flightJSON.getJSONObject("departureAirport").getString("AirportCode");
            String departureAirportName = flightJSON.getJSONObject("departureAirport").getJSONObject("Names").getJSONObject("Name").getString("$");
            String arrivalAirportCode = flightJSON.getJSONObject("arrivalAirport").getString("AirportCode");
            String arrivalAirportName = flightJSON.getJSONObject("arrivalAirport").getJSONObject("Names").getJSONObject("Name").getString("$");
            Toast toast = Toast.makeText(FlightSearchActivity.this,
                    MessageFormat.format("From {0} ({1}) to {2} ({3})", departureAirportCode, departureAirportName, arrivalAirportCode, arrivalAirportName)
                    , Toast.LENGTH_LONG);
            toast.show();

        }
        catch(JSONException jsonex)
        {
            Log.e(TAG, "Error retrieving data.", jsonex);
        }
    }

    private void onFlightNotFound(String flightNumber, LocalDate departureDate) {
        Toast toast = Toast.makeText(FlightSearchActivity.this,
                MessageFormat.format(
                        getString(R.string.flightNotFound), flightNumber, departureDate)
                , Toast.LENGTH_LONG);
        toast.show();
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