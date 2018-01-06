 package com.learnandroid.tutorialactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("pesan", "onCreate dijalankan");
    }

     @Override
     protected void onPause() {
         super.onPause();
         Log.w("pesan", "onPause dijalankan");
     }

     @Override
     protected void onResume() {
         super.onResume();
         Log.w("pesan", "onResume dijalankan");
     }

     @Override
     protected void onStart() {
         super.onStart();
         Log.w("pesan", "onStart dijalankan")
     }

     @Override
     protected void onRestart() {
         super.onRestart();
         Log.w("pesan", "onRestart dijalankan");
     }
 }
