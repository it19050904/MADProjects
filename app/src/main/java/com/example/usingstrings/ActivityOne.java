package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

        TextView txtview2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        txtview2 = findViewById(R.id.textView2);
        txtview2.setText(R.string.Msg2);

    }
}