package com.example.usmanahmed.gsonactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        person usman= new person("usman" ," 0300");
        person sijawal= new person("sijawal" , "0301");
        Gson gson=new Gson();
        String datatoSend=gson.toJson(usman);
        String datatoSend1=gson.toJson(sijawal);
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("rice",datatoSend);
        intent.putExtra("rice1",datatoSend1);
        startActivity(intent);
    }

}
