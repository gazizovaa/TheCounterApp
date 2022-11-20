package com.mastercoding.counter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView counter_text, counter_text2;
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter_text = findViewById(R.id.counter_text);
        counter_text2 = findViewById(R.id.counter_text2);
        btn = findViewById(R.id.btn);

        //Adding the functionalities
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText(""+increaseCounter());
            }
        });
    }

    public int increaseCounter(){
        return ++counter;
    }
}