package org.hisrc.airmeet;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

import com.google.android.gms.gcm.GcmListenerService;

import org.hisrc.airmeet.flight.model.FlightId;
import org.hisrc.airmeet.time.format.DateTimeFormatConstants;
import org.joda.time.LocalDate;

import java.text.MessageFormat;

public class MyGcmListenerService extends GcmListenerService {

    private static final String TAG = "MyGcmListenerService";

    /**
     * Called when message is received.
     *
     * @param from SenderID of the sender.
     * @param data Data bundle containing message data as key/value pairs.
     *             For Set of keys use data.keySet().
     */
    // [START receive_message]
    @Override
    public void onMessageReceived(String from, Bundle data) {
        String flightNumber = data.getString("flightNumber");
        String departureDateString = data.getString("flightDepartureDate");
        LocalDate departureDate = DateTimeFormatConstants.parseDate(departureDateString);
        final FlightId flightId = new FlightId(flightNumber, departureDate);
        String message = data.getString("message");
        if (from.startsWith("/topics/")) {
            sendNotification(flightId, message);
        }
    }
    private void sendNotification(FlightId flightId, String message){
        Intent intent = new Intent(this, FlightSearchActivity.class);
        intent.putExtra(AirmeetExtras.FLIGHT_ID, flightId);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, message.hashCode(), intent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        final String title = MessageFormat.format(getString(R.string.notificationTitleFormat), flightId.getFlightNumber(), flightId.getDepartureDateAsString());

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_stat_ic_notification)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent).setPriority(Notification.PRIORITY_HIGH)
                .setDefaults(Notification.DEFAULT_VIBRATE);
//        if (Build.VERSION.SDK_INT >= 21) notificationBuilder.setVibrate(new long[0]);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(message.hashCode(), notificationBuilder.build());

    }
}