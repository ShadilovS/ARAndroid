package com.example.androidar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Transport extends AppCompatActivity {
    ImageView back;
    Button bus,train,car,lorry,taxi,boat,ship,tank,bicycle,plain;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        back=findViewById(R.id.imageView);
        bus=findViewById(R.id.bus);
        train=findViewById(R.id.train);
        car=findViewById(R.id.car);
        lorry=findViewById(R.id.lorry);
        taxi=findViewById(R.id.taxi);
        boat=findViewById(R.id.boat);
        ship=findViewById(R.id.ship);
        tank=findViewById(R.id.tank);
        bicycle=findViewById(R.id.bicycle);
        plain=findViewById(R.id.plain);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(back.getContext(), ObjectMenu.class);
                startActivity(i);
            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bus.setText("АВТОБУС");
                MediaPlayer.create(bus.getContext(), R.raw.bus).start();
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                train.setText("ПОЕЗД");
                MediaPlayer.create(train.getContext(), R.raw.train).start();
            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                car.setText("МАШИНА");
                MediaPlayer.create(bus.getContext(), R.raw.car).start();
            }
        });
        lorry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lorry.setText("ГРУЗОВИК");
                MediaPlayer.create(bus.getContext(), R.raw.lorry).start();
            }
        });
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taxi.setText("ТАКСИ");
                MediaPlayer.create(bus.getContext(), R.raw.taxi).start();
            }
        });
        boat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boat.setText("ЛОДКА");
                MediaPlayer.create(bus.getContext(), R.raw.boat).start();
            }
        });
        ship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ship.setText("КОРАБЛЬ");
                MediaPlayer.create(bus.getContext(), R.raw.ship).start();
            }
        });
        tank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tank.setText("ТАНК");
                MediaPlayer.create(bus.getContext(), R.raw.tank).start();
            }
        });
        bicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bicycle.setText("ВЕЛОСИПЕД");
                MediaPlayer.create(bus.getContext(), R.raw.bicycle).start();
            }
        });
        plain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plain.setText("САМОЛЁТ");
                MediaPlayer.create(bus.getContext(), R.raw.plain).start();
            }
        });








    }
}