package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name,age,email;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextTextPersonName);
        email = findViewById(R.id.editTextTextPersonName2);
        age = findViewById(R.id.editTextTextPersonName3);
        button = findViewById(R.id.button);
        textView =   findViewById(R.id.textView);

        //to display the data of previous time.
        SharedPreferences preferences = getSharedPreferences("myPref", MODE_PRIVATE);
        String result = preferences.getString("userName", "") + " " +
                preferences.getString("email", "") +" " + preferences.getString("age", "");
        textView.setText(result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("myPref", MODE_PRIVATE);
                SharedPreferences.Editor ed = preferences.edit();
                ed.putString("userName", name.getText().toString());
                ed.putString("email", email.getText().toString());
                ed.putString("age", age.getText().toString());
                ed.apply();
                //for immediate changes to be displayed
                String result = preferences.getString("userName", "") + " " +
                        preferences.getString("email", "") +" " + preferences.getString("age", "");
                textView.setText(result);
            }
        });
    }
}