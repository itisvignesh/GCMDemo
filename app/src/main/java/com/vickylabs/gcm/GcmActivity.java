package com.vickylabs.gcm;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.gcm.GoogleCloudMessaging;

public class GcmActivity  extends ActionBarActivity {
    private TextView contentView;
    GoogleCloudMessaging gcm;
    private static final String SENDER_ID="citric-adviser-533";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
