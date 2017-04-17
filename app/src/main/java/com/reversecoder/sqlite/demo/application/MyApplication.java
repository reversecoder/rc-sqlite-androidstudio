package com.reversecoder.sqlite.demo.application;

import android.app.Application;

import com.reversecoder.sqlite.LitePal;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
