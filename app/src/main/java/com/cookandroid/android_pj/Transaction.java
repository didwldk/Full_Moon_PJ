package com.cookandroid.android_pj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Transaction extends AppCompatActivity {
    Button back_btn;
    TextView title_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        back_btn = findViewById(R.id.back_btn);
        title_txt = findViewById(R.id.title_txt);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Transaction.this, Start_screen.class);  // 화면 전환
                startActivity(intent);
            }
        });

    }

}