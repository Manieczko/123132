package com.example.szkolenie.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class snieg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snieg);
        WebView strona=findViewById(R.id.strona2);
        strona.loadUrl("https://developer.android.com/reference/android/widget/Button.html#pubmethods");



    }

}
