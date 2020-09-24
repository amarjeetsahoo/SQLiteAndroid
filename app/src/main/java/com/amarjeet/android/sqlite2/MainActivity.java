package com.amarjeet.android.sqlite2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.amarjeet.android.sqlite2.model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbHandler db = new MyDbHandler(MainActivity.this);

        // Creating a contact object for the db
        Contact data = new Contact();
        data.setPhoneNumber("9090909090");
        data.setName("Harry");

        // Adding a contact to the db
        db.addContact(data);

        // Creating a contact object for the db
        Contact larry = new Contact();
        larry.setPhoneNumber("9090459090");
        larry.setName("Larry");

        // Adding a contact to the db
        db.addContact(larry);

        // Creating a contact object for the db
        Contact tehri = new Contact();
        tehri.setPhoneNumber("9090675409");
        tehri.setName("Tehri");

        // Adding a contact to the db
        db.addContact(tehri);
        Log.d("dbharry", "Id for tehri and larry are successfully added to the db");
    }
}