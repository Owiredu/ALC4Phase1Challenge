package com.example.alc4phase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the buttons
        Button aboutUsBtn = findViewById(R.id.about_alc_btn);
        Button myProfileBtn = findViewById(R.id.my_profile_btn);
        // add listeners to buttons
        aboutUsBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switchToAboutUs();
                    }
                }
        );
        myProfileBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switchToMyProfile();
                    }
                }
        );
    }

    private void switchToMyProfile() {
        startActivity(new Intent(this, MyProfile.class));
    }

    private void switchToAboutUs() {
        startActivity(new Intent(this, AboutUs.class));
    }
}
