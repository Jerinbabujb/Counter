package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnminus,btnplus;
    TextView count,clear;
    int countValue=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnminus=findViewById(R.id.minus);
        btnplus=findViewById(R.id.plus);
        count=findViewById(R.id.counter);
        clear=findViewById(R.id.clear);

        btnminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v){
                if(countValue!=0)

                {
                    countValue--;
                    count.setText(String.valueOf(countValue));
                }
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue++;
                count.setText(String.valueOf(countValue));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue=0;
                count.setText(String.valueOf(countValue));
            }
        });
    }
}