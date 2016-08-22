package com.example.joec.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra(MainActivity.FIRST_NAME);
        String lastName = intent.getStringExtra(MainActivity.LAST_NAME);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Name: " + firstName + " " + lastName);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
