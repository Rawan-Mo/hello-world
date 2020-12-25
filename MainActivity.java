package com.codepath.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = ((TextView) findViewById(R.id.helloText));

        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                // changing the text color of the label
                textView.setTextColor(getResources().getColor(R.color.pink));
            }
    });
        // User can tap a button to change the color of the background view
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_pink));
            }
        });

        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Android is Awesome!");
            }
        });

        // User can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello from Rawan!");
                textView.setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.baby_blue));
            }
        });

        // User can tap the “Change text string” button to update the label with the text from the text field
        findViewById(R.id.changeTextStringButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput= ((EditText) findViewById(R.id.editHelloText)).getText().toString();
                if(userInput.isEmpty()){
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userInput);
                }
            }
        });

    }
}