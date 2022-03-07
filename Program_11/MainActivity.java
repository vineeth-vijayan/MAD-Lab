package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.CheckBox;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void select(View view)
    {
        boolean checked=((CheckBox)view).isChecked();
        switch(view.getId())
        {
            case R.id.check1:
                if(checked)
                    Toast.makeText(this, "BCA is selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this,"BCA is removed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.check2:
                if(checked)
                    Toast.makeText(this, "MCA is selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "MCA is removed", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}


