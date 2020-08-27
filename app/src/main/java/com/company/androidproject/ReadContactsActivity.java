package com.company.androidproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReadContactsActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_READ_CONTACTS=1;
    private static boolean READ_CONTACTS_GRANTED =false;
    ListView contactList;
    ArrayList<String> contacts = new ArrayList<String>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_contacts);
        contactList = (ListView) findViewById(R.id.contactList);
    }
}
