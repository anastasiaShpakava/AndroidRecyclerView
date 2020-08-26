package com.company.androidproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setInitialData();
        recyclerView = findViewById(R.id.list);
        ContactAdapter contactAdapter = new ContactAdapter(this, contactList);
        recyclerView.setAdapter(contactAdapter);
    }

    private void setInitialData() {

        contactList.add(new Contact(R.drawable.face, "Anna Anna", "358742596814"));
        contactList.add(new Contact(R.drawable.face, "Max Max", "358742596814"));
        contactList.add(new Contact(R.drawable.face, "David David", "358742596814"));
        contactList.add(new Contact(R.drawable.face, "James James", "358742596814"));
        contactList.add(new Contact(R.drawable.face, "Lidia Lidia", "358742596814"));
        contactList.add(new Contact(R.drawable.face, "Alice Alice", "358742596814"));
        contactList.add(new Contact(R.drawable.face, "Mark Mark", "358742596814"));
    }
}