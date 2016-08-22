package com.example.joec.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String FIRST_NAME = "com.example.myfirstapp.FIRST_NAME";
    public final static String LAST_NAME = "com.example.myfirstapp.LAST_NAME";
    public final static String PHONE = "com.example.myfirstapp.PHONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.edit_first_name);
        String firstName = editText.getText().toString();
        intent.putExtra(FIRST_NAME, firstName);

        editText = (EditText) findViewById(R.id.edit_last_name);
        String lastName = editText.getText().toString();
        intent.putExtra(LAST_NAME, lastName);

        editText = (EditText) findViewById(R.id.edit_phone);
        String phone = editText.getText().toString();
        intent.putExtra(PHONE, phone);

        startActivity(intent);
    }
}
