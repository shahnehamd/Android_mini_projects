package com.example.implicit_intent_url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText url;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = (EditText)findViewById(R.id.URL);
        btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String myurl = url.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(myurl));
                startActivity(i);
            }
        });
    }
}