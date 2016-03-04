package org.hisrc.airmeet.gms.gcm;

import android.content.Context;

import com.google.android.gms.gcm.GcmPubSub;

import java.io.IOException;
import java.util.Set;

/**
 * Created by Alexey Valikov on 1/8/2016.
 */
public class SubscribeToTopicTask extends AbstractToggleTopicSubscribtionTask {

    public SubscribeToTopicTask(Context context) {
        super(context);
    }

    @Override
    protected void toggleSubscription(GcmPubSub pubSub, String topic, String token) throws IOException {
        pubSub.subscribe(token, topic, null);
    }

    @Override
    protected void toggleTopic(String topic, Set<String> topics) {
        topics.add(topic);
    }
}