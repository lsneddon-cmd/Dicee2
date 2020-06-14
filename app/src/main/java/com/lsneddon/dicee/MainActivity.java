package com.lsneddon.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Ze button has been pressed");
            }
        });

        ImageView leftDice = findViewById(R.id.image_leftDice);
        ImageView rightDice = findViewById(R.id.image_rightDice);

        int number = (int) Math.abs(Math.ceil(Math.random() * 6));

    }
}