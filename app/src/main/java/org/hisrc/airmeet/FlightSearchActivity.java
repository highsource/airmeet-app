package org.hisrc.airmeet;

import android.app.DatePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;;
import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import org.hisrc.airmeet.flight.model.FlightId;
import org.hisrc.airmeet.flight.task.SearchFlightInfoTask;
import org.joda.time.LocalDate;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FlightSearchActivity extends AppCompatActivity{


    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final static String TAG = FlightSearchActivity.class.getName();

    private BroadcastReceiver mRegistrationBroadcastReceiver;
    private boolean isReceiverRegistered;

    // UI references.
    private EditText mFlightNumberView;
    private EditText mDepartureDateView;
    private Button mSubscribeButton;

    //Date references
    private SimpleDateFormat dateFormatter;
    private EditText fromDateEtxt;
    private EditText toDateEtxt;
    private DatePickerDialog fromDatePickerDialog;
    private DatePickerDialog toDatePickerDialog;

    //TextView
    private TextView mFrom_editText;
    private EditText mTo_editText;
    /*TextView mDepart_editText = (TextView)findViewById(R.id.depart_editText);
    TextView mArrival_editText = (TextView)findViewById(R.id.arrival_editText);
    TextView mStatus_editText = (TextView)findViewById(R.id.status_editText);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_search);
        mFlightNumberView = (EditText) findViewById(R.id.flightNumber_editText);
        mDepartureDateView = (EditText) findViewById(R.id.departureDate_editText);

        mFrom_editText = (TextView)findViewById(R.id.from_editText);
        mTo_editText = (EditText)findViewById(R.id.to_editText);

        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.GERMANY);

        findViewsById();

        setDateTimeField();

        Button mSearchButton = (Button) findViewById(R.id.search_button);
        mSearchButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                final String flightNumber = mFlightNumberView.getText().toString().toUpperCase();
                DatePicker datePicker = fromDatePickerDialog.getDatePicker();
                final LocalDate departureDate = new LocalDate(datePicker.getYear(), datePicker.getMonth() + 1, datePicker.getDayOfMonth());
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

    private void findViewsById() {
        fromDateEtxt = (EditText) findViewById(R.id.departureDate_editText);
        fromDateEtxt.setInputType(InputType.TYPE_NULL);
        fromDateEtxt.requestFocus();

    }

    private void setDateTimeField() {
        fromDateEtxt.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                // // TODO: 05.03.2016
                fromDatePickerDialog.show();
            }
        } );
        Calendar newCalendar = Calendar.getInstance();
        fromDatePickerDialog = new DatePickerDialog(this, new OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                fromDateEtxt.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        toDatePickerDialog = new DatePickerDialog(this, new OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                toDateEtxt.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
    }



    private void searchFlight(final String flightNumber, final LocalDate departureDate) {
        final FlightId flightId = new FlightId(flightNumber, departureDate);
        new SearchFlightInfoTask(FlightSearchActivity.this){
            @Override
            protected void onPostExecute(JSONObject flightJSON) {
                if (flightJSON ==null)
                {
                    onFlightNotFound(flightId);
                }
                else
                {
                    onFlightFound(flightId, flightJSON);
                }
            }
        }.execute(flightId);
    }

    private void onFlightFound(FlightId flightId, JSONObject flightJSON) {



        try {
            String departureAirportCode = flightJSON.getJSONObject("departureAirport").getString("AirportCode");

            String departureAirportName = flightJSON.getJSONObject("departureAirport").getJSONObject("Names").getJSONObject("Name").getString("$");
            mFrom_editText.setText(departureAirportName);

            String arrivalAirportCode = flightJSON.getJSONObject("arrivalAirport").getString("AirportCode");

            String arrivalAirportName = flightJSON.getJSONObject("arrivalAirport").getJSONObject("Names").getJSONObject("Name").getString("$");
            mTo_editText.setText(arrivalAirportName,TextView.BufferType.EDITABLE);

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

    private void onFlightNotFound(FlightId flightId) {
        Toast toast = Toast.makeText(FlightSearchActivity.this,
                MessageFormat.format(
                        getString(R.string.flightNotFound), flightId.getFlightNumber(), flightId.getDepartureDate())
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