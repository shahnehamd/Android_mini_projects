package com.example.autocomplete_text_field;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    String[] countries = {"India","Indonesia","Indiana","Iceland","Somalia","Spain","Nepal","Sri Lanka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actv = (AutoCompleteTextView)findViewById(R.id.ACTV);
        ArrayAdapter <String> adp = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,countries);
        actv.setAdapter(adp);
    }
}