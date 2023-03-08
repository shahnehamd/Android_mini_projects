package com.example.seta_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3,editTextTextPersonName4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextTextPersonName.getText().toString().equals("") || editTextTextPersonName2.getText().toString().equals("") || editTextTextPersonName3.getText().toString().equals("") || editTextTextPersonName4.getText().toString().equals(""))
                {
                    Toast t = Toast.makeText(getBaseContext(),"Field is Empty",Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtra("name",editTextTextPersonName.getText().toString());
                    i.putExtra("name2",editTextTextPersonName2.getText().toString());
                    i.putExtra("name3",editTextTextPersonName3.getText().toString());
                    i.putExtra("name4",editTextTextPersonName4.getText().toString());
                    startActivity(i);
                }
            }
        });

    }
}