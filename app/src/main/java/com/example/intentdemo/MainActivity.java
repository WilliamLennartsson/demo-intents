package com.example.intentdemo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This is a listener
    public void goToNextActivityButton(View view) {
        // Create intent
        Intent intent = new Intent(this, SecondActivity.class);
        // Adds data to the intent
        intent.putExtra("MESSAGE", "Testar skicka en liten text");
        intent.putExtra("SECOND_MESSAGE", 150);
        // Starts second activity
        startActivityForResult(intent, 10);
    }

    // This method gets called when the second activity is finished
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10){
            if (resultCode == 0) {
                if (data != null) {
                    String result = data.getStringExtra("RESULT");
                    // Gör något med resultatet
                }
            }
        }
    }

}
