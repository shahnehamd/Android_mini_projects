package com.example.videoview;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoview =(VideoView)findViewById(R.id.video);
        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.myvid));

        MediaController md = new MediaController(this);
        md.setAnchorView(videoview);
        videoview.setMediaController(md);
        videoview.start();

        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("uri", (Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.myvid)).toString());
        startActivity(intent);
    }
}