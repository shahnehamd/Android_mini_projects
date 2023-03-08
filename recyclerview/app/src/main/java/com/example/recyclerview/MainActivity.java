package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    String[] countries = {"India","Indonesia","Indiana","Iceland","Somalia","Spain","Nepal","Sri Lanka","India","Indonesia","Indiana","Iceland","Somalia","Spain","Nepal","Sri Lanka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView)findViewById(R.id.rv);

        CustomAdapter c = new CustomAdapter(countries);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(c);
    }
}