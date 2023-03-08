package com.example.setb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String date = i.getStringExtra("date");

        Toast toast = Toast.makeText(getBaseContext(),name + " " + date,Toast.LENGTH_LONG);
        toast.show();
    }
}