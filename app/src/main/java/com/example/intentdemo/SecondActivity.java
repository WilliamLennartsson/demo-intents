package com.example.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the intent
        Intent intent = getIntent();

        // Pull out the data
        String resultString = intent.getStringExtra("MESSAGE");
        int secondResultInt = intent.getIntExtra("SECOND_MESSAGE", 0);

        TextView textView = findViewById(R.id.result_text_view);
        String finalString = resultString + secondResultInt;
        textView.setText(finalString);

        // Send back result to mainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("RESULT", "Här kommer massa text tillbak");
        setResult(0, resultIntent);

        // Closes the activity
        finish();
    }
}
