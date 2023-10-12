package com.cookandroid.android_pj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Start_screen extends AppCompatActivity {
    Button push_btn, pull_btn;
    TextView title_txt;
    EditText title_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        setTitle("저금통");

        push_btn = findViewById(R.id.push_btn);
        pull_btn = findViewById(R.id.pull_btn);



//        채우기 -> 채우는 화면 이동(Transcation)
        push_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start_screen.this, Transaction.class);   // 화면 전환
                startActivity(intent);
            }
        });

//        꺼내기 -> 꺼내는 화면 이동(Transcation)
        pull_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start_screen.this, Transaction.class);   // 화면 전환
                startActivity(intent);
            }
        });

    }
}