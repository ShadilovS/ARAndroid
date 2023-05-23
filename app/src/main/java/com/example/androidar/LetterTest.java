package com.example.androidar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.androidar.R;
import com.example.androidar.SQLiteAdapter;

public class LetterTest extends Activity {


    TextView letter;
    RadioGroup radioGroup;
    RadioButton ans1,ans2,ans3;
    private SQLiteAdapter mySQLiteAdapter;
    ImageView next;
    public int id=0;
    public int true_ans=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_test);
        test(0);
    }
    private void test(int id) {
        TextView letter = findViewById(R.id.letter);
        RadioGroup radioGroup = findViewById(R.id.radio);
        RadioButton ans1 = findViewById(R.id.ans1);
        RadioButton ans2 = findViewById(R.id.ans2);
        RadioButton ans3 = findViewById(R.id.ans3);
        ImageView next = findViewById(R.id.next);
        int supchik = id;
        if (id == 0) {
            letter.setText("A");
        }
        if (id == 1) {
            letter.setText("Q");
        }
        if (id == 2) {
            letter.setText("R");
        }
        if (id == 3) {
            letter.setText("S");
        }
        if (id == 4) {
            letter.setText("T");
        }
        ans1.setOnClickListener(new View.OnClickListener() {
            int id=supchik;
            @Override
            public void onClick(View view) {
                if (id == 0) {
                    MediaPlayer.create(ans1.getContext(), R.raw.testa).start();
                }
                if (id == 1) {
                    MediaPlayer.create(ans1.getContext(), R.raw.testo).start();
                }
                if (id == 2) {
                    MediaPlayer.create(ans1.getContext(), R.raw.testr).start();
                }
                if (id == 3) {
                    MediaPlayer.create(ans1.getContext(), R.raw.tests).start();
                }
                if (id == 4) {
                    MediaPlayer.create(ans1.getContext(), R.raw.testp).start();
                }

            }

        });
        ans2.setOnClickListener(new View.OnClickListener() {
            int id=supchik;
            @Override
            public void onClick(View view) {
                if (id == 0) {
                    MediaPlayer.create(ans2.getContext(), R.raw.testb).start();
                }
                if (id == 1) {
                    MediaPlayer.create(ans2.getContext(), R.raw.testq).start();
                }
                if (id == 2) {
                    MediaPlayer.create(ans2.getContext(), R.raw.testx).start();
                }
                if (id == 3) {
                    MediaPlayer.create(ans2.getContext(), R.raw.testk).start();
                }
                if (id == 4) {
                    MediaPlayer.create(ans2.getContext(), R.raw.testu).start();
                }

            }

        });
        ans3.setOnClickListener(new View.OnClickListener() {
            int id=supchik;
            @Override
            public void onClick(View view) {
                if (id == 0) {
                    MediaPlayer.create(ans3.getContext(), R.raw.testc).start();
                }
                if (id == 1) {
                    MediaPlayer.create(ans3.getContext(), R.raw.testa).start();
                }
                if (id == 2) {
                    MediaPlayer.create(ans3.getContext(), R.raw.testz).start();
                }
                if (id == 3) {
                    MediaPlayer.create(ans3.getContext(), R.raw.testc).start();
                }
                if (id == 4) {
                    MediaPlayer.create(ans3.getContext(), R.raw.testt).start();
                }

            }

        });
        next.setOnClickListener(new View.OnClickListener() {
            int id=supchik;
            @Override
            public void onClick(View view) {
                if (id == 0) {
                    if (radioGroup.getCheckedRadioButtonId() == ans1.getId()) {
                        true_ans++;
                    }
                }
                if (id == 1) {
                    if (radioGroup.getCheckedRadioButtonId() == ans2.getId()) {
                        true_ans++;
                    }
                }
                if (id == 2) {
                    if (radioGroup.getCheckedRadioButtonId() == ans1.getId()) {
                        true_ans++;
                    }
                }
                if (id == 3) {
                    if (radioGroup.getCheckedRadioButtonId() == ans1.getId()) {
                        true_ans++;
                    }
                }
                if (id == 4) {
                    if (radioGroup.getCheckedRadioButtonId() == ans3.getId()) {
                        true_ans++;
                    }
                    mySQLiteAdapter = new SQLiteAdapter(next.getContext());
                    mySQLiteAdapter.openToWrite();
                    mySQLiteAdapter.deleteAll();
                    int prc = (true_ans * 100) / 5;
                    String percent = String.valueOf(prc);
                    mySQLiteAdapter.insert(percent + "%");
                    mySQLiteAdapter.insert("100%");
                    mySQLiteAdapter.close();

                    Intent i = new Intent(next.getContext(), LetterMenu.class);
                    startActivity(i);
                }

                id++;
                ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                test(id);
            }



        });
    }


}