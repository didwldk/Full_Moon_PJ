package com.cookandroid.android_pj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;



import java.util.ArrayList;

public class Transaction<AddActivity> extends AppCompatActivity {
    private static String TAG = "MainActivity";
    Button load, save;
    EditText inputText;
    TextView title_txt, max_num;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
    }

}