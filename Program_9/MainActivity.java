package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button plus,minus;
    TextView total_count,reset;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=(Button)findViewById(R.id.btnplus);
        minus=(Button)findViewById(R.id.btnminus);
       total_count= findViewById(R.id.btncount);
        reset=(Button)findViewById(R.id.btnreset);

        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                count++;
                total_count.setText(count + "");
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                count--;
                total_count.setText(count + "");
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                count=0;
                total_count.setText(count + "");
            }
        });
    }
}
