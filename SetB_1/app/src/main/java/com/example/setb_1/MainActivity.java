package com.example.setb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cars c1 = new cars("car1","mydate1","img1");
        cars c2 = new cars("car2","mydate2","img2");

        cars[] carss = {c1,c2};
        String arr[] = {c1.name,c2.name};

        lv = findViewById(R.id.lv);

        ArrayAdapter<String> aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                String car_name = String.valueOf(parent.getItemAtPosition(position));
                for(int j=0;j<carss.length;j++){
                    if( car_name.equals(carss[j].name)){
                        i.putExtra("name",carss[j].name);
                        i.putExtra("date",carss[j].date);
                        startActivity(i);
                    }
                }
            }
        });

    }
}