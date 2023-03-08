package com.example.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast toast = Toast.makeText(getBaseContext(),"2nd activity",Toast.LENGTH_LONG);
        toast.show();

        videoView=findViewById(R.id.videoView);

        Intent intent = getIntent();
        String uri = intent.getStringExtra("uri");

        videoView.setVideoURI(Uri.parse(uri));
        videoView.start();
    }
}