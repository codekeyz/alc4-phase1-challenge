package com.devchima.apps.alc4android.phase1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AppCompatButton profileButton = findViewById(R.id.profileBtn);
        AppCompatButton aboutButton = findViewById(R.id.aboutBtn);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ProfileActivity.class);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(AboutActivity.class);
            }
        });
    }


    private void startActivity(Class<? extends AppCompatActivity> activity) {
        Intent intent = new Intent(getApplicationContext(), activity);
        startActivity(intent);
    }
}
