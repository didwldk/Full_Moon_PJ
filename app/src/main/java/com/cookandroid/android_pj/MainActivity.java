package com.cookandroid.android_pj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button title_btn, start_btn;
    EditText title_edt, max_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시작 설정 화면");

        title_btn = findViewById(R.id.title_btn);
        start_btn = findViewById(R.id.start_btn);
        title_edt = findViewById(R.id.title_edt);
        max_edt = findViewById(R.id.max_edt);

        // 저금통 제목 넣고 완료
//        title_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Start_screen.class);
//                intent.putExtra("제목: ",title_edt.getText().toString());
//                startActivity(intent);
//            }
//        });

        // 저금통 시작하기 버튼 - 누르면 activity_main.xml로 넘어감
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start_screen.class);  // 화면 전환
                startActivity(intent);
            }
        });




    }
}