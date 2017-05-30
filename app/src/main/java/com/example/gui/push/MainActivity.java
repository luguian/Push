package com.example.gui.push;

import android.app.Activity;
import android.os.Bundle;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushManager.startWork(getApplicationContext(), PushConstants.LOGIN_TYPE_API_KEY,"qfnphLYDQk4sYiUDwUije9bn");
    }
}
