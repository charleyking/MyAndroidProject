package com.example.charleyking.notivicationtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *Created by charleyking on 2/17/16.
 */
public class MainActivity extends Activity {
    private Button sendNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        sendNotification = (Button) findViewById(R.id.send_notification);
        sendNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.send_notification:
                        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        Notification notification = new Notification(R.mipmap.ic_launcher, "This is ticker text", System.currentTimeMillis());
                        notification.setLatestEventInfo(this, "This is content title", "This is content text", null);
                        manager.notify(1, notification);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
