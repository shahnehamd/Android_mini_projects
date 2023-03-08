package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String selected = i.getStringExtra("extra");
//        Toast t = Toast.makeText(getBaseContext(),selected,Toast.LENGTH_LONG);
//        t.show();
        tv = findViewById(R.id.textView);
        if(selected.equals("data analysis")){
            tv.setText("to be a "+selected+" skills need are: \n Python \n AWS/GCP");
        }
        else if(selected.equals("full stack developer")){
            tv.setText("to be a "+selected+" skills need are: \n MEAN \n MERN");
        }
        else{
            tv.setText("to be a "+selected+" skills need are: \n AI \n ML");
        }
    }
}