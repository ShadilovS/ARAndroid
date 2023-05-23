package com.example.androidar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Figure extends AppCompatActivity {
    ImageView back;
    Button triangle,square,cross,circle,rectangle,star,heart;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figure);
        back=findViewById(R.id.imageView);
        triangle=findViewById(R.id.triangle);
        square=findViewById(R.id.square);
        cross=findViewById(R.id.cross);
        circle=findViewById(R.id.circle);
        rectangle=findViewById(R.id.rectangle);
        star=findViewById(R.id.star);
        heart=findViewById(R.id.heart);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(back.getContext(), ObjectMenu.class);
                startActivity(i);
            }
        });
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                triangle.setText("ТРЕУГОЛЬНИК");
                MediaPlayer.create(triangle.getContext(), R.raw.triangle).start();
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                square.setText("КВАДРАТ");
                MediaPlayer.create(triangle.getContext(), R.raw.square).start();
            }
        });
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cross.setText("КРЕСТ");
                MediaPlayer.create(triangle.getContext(), R.raw.cross).start();
            }
        });
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circle.setText("КРУГ");
                MediaPlayer.create(triangle.getContext(), R.raw.circle).start();
            }
        });
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rectangle.setText("ПРЯМОУГОЛЬНИК");
                MediaPlayer.create(triangle.getContext(), R.raw.rectangle).start();
            }
        });
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star.setText("ЗВЕЗДА");
                MediaPlayer.create(triangle.getContext(), R.raw.star).start();
            }
        });
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heart.setText("СЕРДЦЕ");
                MediaPlayer.create(triangle.getContext(), R.raw.heart).start();
            }
        });
    }
}