package com.example.sarah.rect;


import android.os.Bundle;

import android.app.Activity;
import android.graphics.Color;


public class MainActivity extends Activity {
    DrawView drawView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);

    }
}