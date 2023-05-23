package com.example.androidar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Animal extends AppCompatActivity {
    ImageView back;
    Button cat,fish,bear,snake,mouse,frog,elephant,crocodile,horse,monkey,cow;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        back=findViewById(R.id.imageView);
        cat=findViewById(R.id.cat);
        fish=findViewById(R.id.fish);
        bear=findViewById(R.id.bear);
        snake=findViewById(R.id.snake);
        mouse=findViewById(R.id.mouse);
        frog=findViewById(R.id.frog);
        elephant=findViewById(R.id.elephant);
        crocodile=findViewById(R.id.crocodile);
        horse=findViewById(R.id.horse);
        monkey=findViewById(R.id.monkey);
        cow=findViewById(R.id.cow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(back.getContext(), ObjectMenu.class);
                startActivity(i);
            }
        });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cat.setText("КОТ");
                MediaPlayer.create(cat.getContext(), R.raw.cat).start();
            }
        });
        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fish.setText("РЫБА");
                MediaPlayer.create(cat.getContext(), R.raw.fish).start();
            }
        });
        bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bear.setText("МЕДВЕДЬ");
                MediaPlayer.create(cat.getContext(), R.raw.bear).start();
            }
        });
        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snake.setText("ЗМЕЯ");
                MediaPlayer.create(cat.getContext(), R.raw.snake).start();
            }
        });
        mouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mouse.setText("МЫШЬ");
                MediaPlayer.create(cat.getContext(), R.raw.mouse).start();
            }
        });
        frog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frog.setText("ЛЯГУШКА");
                MediaPlayer.create(cat.getContext(), R.raw.frog).start();
            }
        });
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephant.setText("СЛОН");
                MediaPlayer.create(cat.getContext(), R.raw.elephant).start();
            }
        });
        crocodile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crocodile.setText("КРОКОДИЛ");
                MediaPlayer.create(cat.getContext(), R.raw.crocodile).start();
            }
        });
        horse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horse.setText("ЛОШАДЬ");
                MediaPlayer.create(cat.getContext(), R.raw.horse).start();
            }
        });
        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monkey.setText("ОБЕЗЬЯНА");
                MediaPlayer.create(cat.getContext(), R.raw.monkey).start();
            }
        });
        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cow.setText("КОРОВА");
                MediaPlayer.create(cat.getContext(), R.raw.cow).start();
            }
        });








    }
}