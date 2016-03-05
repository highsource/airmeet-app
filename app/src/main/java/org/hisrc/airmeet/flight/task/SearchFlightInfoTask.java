package org.hisrc.airmeet.flight.task;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.hisrc.airmeet.R;
import org.hisrc.airmeet.flight.model.FlightId;
import org.hisrc.airmeet.time.format.DateTimeFormatConstants;
import org.json.JSONObject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Alexey Valikov on 3/4/2016.
 */
public class SearchFlightInfoTask extends AsyncTask<FlightId, Void, JSONObject> {

    private final String TAG = "SearchFlightInfo";
    private final Context context;

    public SearchFlightInfoTask(Context context) {
        this.context = context;
    }

    @Override
    protected JSONObject doInBackground(FlightId... params) {
        final FlightId flightId = params[0];
        OkHttpClient client = new OkHttpClient();
        final String flightinfoPattern = context.getString(R.string.flightinfoPattern);
        final String url =
                String.format(flightinfoPattern, flightId.getFlightNumber(), DateTimeFormatConstants.DATE_FORMATTER.print(flightId.getDepartureDate()));
        Request request = new Request.Builder()
                .url(url).get().build();

        try {
            final Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                final ResponseBody body = response.body();
                final String result = body.string();
                return new JSONObject(result);
            } else {
                return null;
            }
        } catch (Exception ioex) {
            Log.i(TAG, "Could not load", ioex);
            return null;
        }
    }
}
