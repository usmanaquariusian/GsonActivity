package com.example.usmanahmed.gsonactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Gson gson=new Gson();
        String datatoGet=getIntent().getStringExtra("rice");
        String datatoGet1=getIntent().getStringExtra("rice1");
        person get= gson.fromJson(datatoGet,person.class);
        person get1=gson.fromJson(datatoGet1,person.class);
        Toast.makeText(this,get.getName()+" : "+get.getNumber(),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,get1.getName()+" : "+get1.getNumber(),Toast.LENGTH_SHORT).show();


    }
}
