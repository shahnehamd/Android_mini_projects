package com.example.prac2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button4, button5, button2, button6;
    EditText editTextNumber, editTextNumber2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button2 = (Button)findViewById(R.id.button2);
        button6 = (Button)findViewById(R.id.button6);

        editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        editTextNumber2 = (EditText)findViewById(R.id.editTextNumber2);

        textView = (TextView)findViewById(R.id.textView);

        button4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int num1 =Integer.parseInt(editTextNumber.getText().toString());
                int num2 =Integer.parseInt(editTextNumber2.getText().toString());
                int num3 = num1+num2;
                textView.setText(" "+num3);

            }
        });

        button5.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                int num1 =Integer.parseInt(editTextNumber.getText().toString());
                int num2 =Integer.parseInt(editTextNumber2.getText().toString());
                int num3 = num1-num2;
                textView.setText(" "+num3);
            }
        });

        button2.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                int num1 =Integer.parseInt(editTextNumber.getText().toString());
                int num2 =Integer.parseInt(editTextNumber2.getText().toString());
                int num3 = num1*num2;
                textView.setText(" "+num3);
            }
        });

        button6.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                int num1 =Integer.parseInt(editTextNumber.getText().toString());
                int num2 =Integer.parseInt(editTextNumber2.getText().toString());
                int num3 = num1/num2;
                textView.setText(" "+num3);
            }
        });
    }
}