package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.textView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String avg = intent.getStringExtra("avg");

        tv.setText("HELLO "+name+"!!! \nYou got "+avg+" %");

    }
}