package com.company.androidproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
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

    public void dial(View v) {
        String toDial = "tel:" + textNumber.getText().toString();
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(toDial));
        startActivity(callIntent);
    }
    String subject = "Test";
    String message = "Test";

    public void sendEmail (View v){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"shpakavaa@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, message);
        emailIntent.setType("message/rfc822");
        startActivity(emailIntent);
    }
}


