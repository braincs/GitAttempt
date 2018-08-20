package com.megvii.gitattempt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello git test, 1st release");

        int res = NewFeature.add(1, 2);
        System.out.println("add feature added finish");
    }
}
