package com.example.app_exchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button btnConv;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.txt_inp);
        btnConv = findViewById(R.id.btn);
        result = findViewById(R.id.txt_res);
        btnConv.setOnClickListener(v -> {
            float dollar = Float.parseFloat(input.getText().toString());
            float dirham = dollar * 10.26f;
            result.setText(String.valueOf(dirham) + " DH");
        });
    }
}