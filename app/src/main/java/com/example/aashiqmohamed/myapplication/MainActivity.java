package com.example.aashiqmohamed.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView dice1;
    ImageView dice2;
    ConstraintLayout layout;
    Random random = new Random();
    Random random2 = new Random();
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout = findViewById(R.id.layout);
                Random random3 = new Random();
                int colors = Color.argb(255,random3.nextInt(256),random3.nextInt(256),random3.nextInt(256));
                layout.setBackgroundColor(colors);
            }
        });
    }

    public void rollBtn(View view){

        dice1 = findViewById(R.id.dice1);
        dice2 = findViewById(R.id.dice2);
        int Ran = random.nextInt(6)+1;
        int Ran2 = random2.nextInt(6)+1;

        switch (Ran){

            case 1:
                dice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice1.setImageResource(R.drawable.dice2);
                break;
                case 3:
                dice1.setImageResource(R.drawable.dice3);
            case 4:
                dice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice1.setImageResource(R.drawable.dice6);
                break;
        }

        switch (Ran2){

            case 1:
                dice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice2.setImageResource(R.drawable.dice6);
                break;
        }

    }

}
