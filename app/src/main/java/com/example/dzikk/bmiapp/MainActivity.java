package com.example.dzikk.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText height;
    private EditText weight;
    private  EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonOblicz);
        height = findViewById(R.id.etHeight);
        weight = findViewById(R.id.etWeight);
        result = findViewById(R.id.etResult);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String sHeight = height.getText().toString().trim();
        String sWeight = weight.getText().toString().trim();

        double aHeight = Double.parseDouble(sHeight);
        aHeight/=100;
        double aWeight = Double.parseDouble(sWeight);

        double aResult = aWeight/aHeight/aHeight ;
        aResult*=100;
        aResult=Math.round(aResult);
        aResult/=100;

         result.setText(String.valueOf(aResult));

    }
}
