package com.example.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_baseline_airplanemode_active_24);

        Intent sendimage = new Intent(MainActivity.this, MainActivity2.class);
        sendimage.putExtra("image", R.drawable.ic_baseline_airplanemode_active_24);
        startActivity(sendimage);
    }
}