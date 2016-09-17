package com.example.mitchelle.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//Array of options

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread bg = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent misha = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(misha);
                    finish();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        bg.start();
    }
}
