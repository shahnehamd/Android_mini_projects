package com.example.seta_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String name2 = i.getStringExtra("name2");
        String name3 = i.getStringExtra("name3");
        String name4 = i.getStringExtra("name4");

        textView.setText(name + " " + name2 + " " + name3 + " " + name4);

    }
}