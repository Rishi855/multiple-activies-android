package com.example.activitymultiple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class LinearLayoutVertical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_vertical);
        getSupportActionBar().setTitle("Linear Vertical Layout");

        WebView web = findViewById(R.id.web);
        RadioGroup radioGrp = findViewById(R.id.radiogrp);
        Button b = findViewById(R.id.search);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioid = radioGrp.getCheckedRadioButtonId();
                RadioButton rb = findViewById(radioid);
                String search = rb.getText().toString();
                if(search.equals("Google"))
                    web.loadUrl("https://www.google.com");
                else
                    web.loadUrl("https://www.youtube.com");
            }
        });
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());

        Intent nextPage = new Intent(getApplicationContext(),FrameLayout.class);
        Button btn = findViewById(R.id.btnLayoutVer);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextPage);
            }
        });
    }
}