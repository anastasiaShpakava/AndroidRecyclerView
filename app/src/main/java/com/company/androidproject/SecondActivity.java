package com.company.androidproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView textNumber;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary_activity);
        getSupportActionBar().hide();
        String number = getIntent().getStringExtra("number");
        textNumber = findViewById(R.id.textNumber);
        textNumber.setText(number);
        imageView = findViewById(R.id.imageV);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("photoId");
            imageView.setImageResource(resId);
        }
    }
}


