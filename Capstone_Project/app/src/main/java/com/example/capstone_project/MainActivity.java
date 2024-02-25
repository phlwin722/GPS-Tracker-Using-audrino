package com.example.capstone_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton Hidebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hidebutton = (ToggleButton) findViewById(R.id.Hidebutton);


    }
}