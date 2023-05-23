package com.example.androidar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fruit extends AppCompatActivity {
    ImageView back;
    Button apple,strawberry,watermelon,orange,raspberry,pineapple,kiwi,apricot,lemon;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        back=findViewById(R.id.imageView);
        apple=findViewById(R.id.apple);
        strawberry=findViewById(R.id.strawberry);
        watermelon=findViewById(R.id.watermelon);
        orange=findViewById(R.id.orange);
        raspberry=findViewById(R.id.raspberry);
        pineapple=findViewById(R.id.pineapple);
        kiwi=findViewById(R.id.kiwi);
        apricot=findViewById(R.id.apricot);
        lemon=findViewById(R.id.lemon);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(back.getContext(), ObjectMenu.class);
                startActivity(i);
            }
        });
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apple.setText("ЯБЛОКО");
                MediaPlayer.create(apple.getContext(), R.raw.apple).start();
            }
        });
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strawberry.setText("КЛУБНИКА");
                MediaPlayer.create(apple.getContext(), R.raw.strawberry).start();
            }
        });
        watermelon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                watermelon.setText("АРБУЗ");
                MediaPlayer.create(apple.getContext(), R.raw.watermelon).start();
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orange.setText("АПЕЛЬСИН");
                MediaPlayer.create(apple.getContext(), R.raw.orange).start();
            }
        });
        raspberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                raspberry.setText("МАЛИНА");
                MediaPlayer.create(apple.getContext(), R.raw.raspberry).start();
            }
        });
        pineapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pineapple.setText("АНАНАС");
                MediaPlayer.create(apple.getContext(), R.raw.pineapple).start();
            }
        });
        kiwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kiwi.setText("КИВИ");
                MediaPlayer.create(apple.getContext(), R.raw.kiwi).start();
            }
        });
        apricot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apricot.setText("АБРИКОС");
                MediaPlayer.create(apple.getContext(), R.raw.apricot).start();
            }
        });
        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lemon.setText("ЛИМОН");
                MediaPlayer.create(apple.getContext(), R.raw.lemon).start();
            }
        });







    }
}