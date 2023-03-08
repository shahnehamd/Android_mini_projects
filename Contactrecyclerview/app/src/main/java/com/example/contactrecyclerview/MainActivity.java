package com.example.contactrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contact c1 = new contact("Neha","9819997544");
        contact c2 = new contact("Nidhi","xxxxxxxxxx");
        contact c3 = new contact("Prashant","9987862500");
        contact c4 = new contact("Afraz","9967108919");
        contact c5 = new contact("Mudit","9619296746");
        contact c6 = new contact("Sundari","9619986746");
        contact c7 = new contact("Madnani","9619296746");

        contact arr[]={c1,c2,c3,c4,c5,c6,c7};
        rv = findViewById(R.id.rv);

        CustomAdapter c = new CustomAdapter(arr);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(c);
    }
}