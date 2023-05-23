package com.example.androidar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FirstActivity extends AppCompatActivity {
    Button letter,object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        letter=findViewById(R.id.letter);
        object=findViewById(R.id.object);
        Intent go_Letter=new Intent(this, LetterMenu.class);
        Intent go_Object=new Intent(this, ObjectMenu.class);
        letter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_Letter);
            }
        });
        object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_Object);
            }
        });

    }
}