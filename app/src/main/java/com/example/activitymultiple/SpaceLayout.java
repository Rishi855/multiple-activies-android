package com.example.activitymultiple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpaceLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_layout);
        getSupportActionBar().setTitle("Space Layout");

        Intent nextPage = new Intent(getApplicationContext(),MainActivity.class);
        Button btn = findViewById(R.id.btnLayoutSpace);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextPage);
            }
        });
    }
}