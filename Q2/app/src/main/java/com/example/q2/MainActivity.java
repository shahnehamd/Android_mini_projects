package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        vv = findViewById(R.id.videoView);
//        vv.setVideoURI(Uri.parse("C:\\Users\\shahn\\AndroidStudioProjects\\Q2\\app\\src\\main\\res\\raw\\myvideo.mp4"));
//        vv.start();
    }
}