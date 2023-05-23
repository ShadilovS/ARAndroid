package com.example.androidar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class ObjectMenu extends AppCompatActivity {
    public static int ans=0;
    ImageView fruit,back,animal,transport,figure;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_menu);
        fruit=findViewById(R.id.imageView12);
        back=findViewById(R.id.imageView4);
        animal=findViewById(R.id.imageView18);
        transport=findViewById(R.id.imageView20);
        figure=findViewById(R.id.imageView23);
        Intent go_Fruit=new Intent(this, Fruit.class);
        Intent go_back=new Intent(this, FirstActivity.class);
        Intent go_Animal=new Intent(this, Animal.class);
        Intent go_Transport=new Intent(this, Transport.class);
        Intent go_Figure=new Intent(this, Figure.class);
        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans++;
                startActivity(go_Fruit);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_back);

            }
        });
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans++;
                startActivity(go_Animal);
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans++;
                startActivity(go_Transport);
            }
        });
        figure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans++;
                startActivity(go_Figure);
            }
        });

        if (ans==4){
            AlertDialog.Builder builder = new AlertDialog.Builder(ObjectMenu.this);
            builder.setTitle("Поздравляю с успешным окончанием курса!").setMessage("Сейчас вы будете перенаправлены на получение стикеров");
            AlertDialog dialog = builder.create();
            dialog.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/addstickers/Poko_Eng"));
                    startActivity(browserIntent);
                }
            }, 4000);


        }
    }
}