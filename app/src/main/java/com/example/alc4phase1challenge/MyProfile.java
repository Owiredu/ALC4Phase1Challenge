package com.example.alc4phase1challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        //get imageview
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.owiredu);
    }
}
