package com.example.explicit_intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name,m1,m2,m3;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText n = (EditText)findViewById(R.id.Name);
        EditText m1 = (EditText)findViewById(R.id.m1);
        EditText m2 = (EditText)findViewById(R.id.m2);
        EditText m3 = (EditText)findViewById(R.id.m3);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = n.getText().toString();
                int marks1 =Integer.parseInt(m1.getText().toString());
                int marks2 =Integer.parseInt(m2.getText().toString());
                int marks3 =Integer.parseInt(m3.getText().toString());
                float avg = ((marks1+marks2+marks3)/3);
                String avg1 = Float.toString(avg);
                Toast.makeText(getApplicationContext(), "" + avg, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("avg", avg1);
                startActivity(intent);
            }
        });
    }
}