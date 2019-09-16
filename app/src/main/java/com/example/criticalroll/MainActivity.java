package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer roll = MediaPlayer.create(this, R.raw.roll);
        final MediaPlayer derekawe = MediaPlayer.create(this, R.raw.derekawe);
        final MediaPlayer maxiumumderek = MediaPlayer.create(this, R.raw.maximumderek);

        message = (TextView) findViewById(R.id.message);
        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
                roll.start();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt( 20) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                message.setText("Critical Miss :(");
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                message.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                message.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                message.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                message.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                message.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                message.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                message.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                message.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                message.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                message.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                message.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                message.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                message.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                message.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                message.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                message.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                message.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                message.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                message.setText("Critical Hit!! Raaaaadddddd");
                break;
        }
    }
}
