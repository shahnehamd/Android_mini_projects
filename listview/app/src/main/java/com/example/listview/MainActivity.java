package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String banksArray[] = {"State Bank of India", "Bank of Maharashtra", "Saraswat Bank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);

        ArrayAdapter<String> banksAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, banksArray);
        lv.setAdapter(banksAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedBank = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, selectedBank, Toast.LENGTH_SHORT).show();
            }
        });
    }
}