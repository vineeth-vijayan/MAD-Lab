package com.example.program10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    protected void onPause()
    {
        super.onResume();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    protected void onStop()
    {
        super.onResume();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy()
    {
        super.onResume();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}

