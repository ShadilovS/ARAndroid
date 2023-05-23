package com.example.androidar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class LetterMenu extends AppCompatActivity {
    ImageView first,second;
    ImageView third,fourth,back;
    Button button;
    public int Test=0;
    private SQLiteAdapter mySQLiteAdapter;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_menu);
        button=findViewById(R.id.button7);
        back=findViewById(R.id.imageView4);
        third=findViewById(R.id.imageView15);
        first=findViewById(R.id.imageView12);
        fourth=findViewById(R.id.imageView16);
        mySQLiteAdapter = new SQLiteAdapter(this);
        mySQLiteAdapter.openToRead();
        String contentRead = mySQLiteAdapter.queueAll();
        mySQLiteAdapter.close();
        if (contentRead.contains("60%") || contentRead.contains("80%") || contentRead.contains("100%")){
            button.setText("     Тест пройден           "+contentRead);
            Drawable img = button.getContext().getResources().getDrawable( R.drawable.correct);
            button.setCompoundDrawablesWithIntrinsicBounds( img, null, null, null);

        }else{
            button.setText("     Пройти тест           "+contentRead);
        }
        Intent i = new Intent(this, FirstActivity.class);
        Intent go_Main = new Intent(this, MainActivity.class);
        Intent go_Main2 = new Intent(this, MainActivity2.class);
        Intent go_Main3 = new Intent(this, MainActivity3.class);
        Intent go_Main4 = new Intent(this,MainActivity4.class);
        Intent go_Test = new Intent(this, LetterTest.class);
        second=findViewById(R.id.imageView13);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_Main);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_Main2);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_Main3);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_Main4);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(go_Test);
                Test++;
            }
        });


    }
}