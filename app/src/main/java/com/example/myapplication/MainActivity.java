package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button math;
private EditText  road;
private TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        math=(Button)findViewById(R.id.button_math);
        math.setOnClickListener(mathOnClick);
        road =(EditText)findViewById(R.id.editText_Road);
        sum =(TextView)findViewById(R.id.textView_Sum);

    }
    protected View.OnClickListener mathOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        int extra,money;
        int Road = Integer.parseInt(road.getText().toString());
        extra = Road/250;
        if(Road%250>0)
        extra++;
        money=extra*5+75;
        sum.setText(String.format(money+"元"));
        }
    };
}

