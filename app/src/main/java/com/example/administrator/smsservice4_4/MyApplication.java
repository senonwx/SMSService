package com.example.administrator.smsservice4_4;

import android.app.Application;

import cn.smssdk.SMSSDK;

/**
 * Created by Administrator on 2017/4/4.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SMSSDK.initSDK(this, "1caf39ed83e8a", "3e1218b2628d7054b1eaf0f15acfcf3a");
    }
}
