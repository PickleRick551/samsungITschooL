package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Integer count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.text1);

        if (view.getId() == R.id.button1) {
            count++;
            textView.setText(count.toString());
        }
    }
}
