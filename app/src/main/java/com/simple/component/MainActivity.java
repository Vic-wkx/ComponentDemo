package com.simple.component;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
//        ARouter.getInstance().build("/first/main").navigation();

        // 2. 跳转并携带参数
//        ARouter.getInstance().build("/first/main")
//                .withLong("key1", 666L)
//                .withString("key2", "888")
//                .navigation();

    }
}
