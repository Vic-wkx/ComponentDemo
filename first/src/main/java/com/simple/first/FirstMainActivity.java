package com.simple.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/first/main")
public class FirstMainActivity extends AppCompatActivity {
    private static final String TAG = "FirstMainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main);
        Log.d(TAG, "onCreate: "+getIntent().getLongExtra("key1",-1));
        Log.d(TAG, "onCreate: "+getIntent().getStringExtra("key2"));

    }
}
