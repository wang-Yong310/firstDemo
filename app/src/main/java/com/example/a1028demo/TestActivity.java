package com.example.a1028demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView tvUserName, tvPassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        tvUserName = findViewById(R.id.tvUserName);
        tvPassWord = findViewById(R.id.tvPassWord);

        //获取intent中的数据
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        String passWord = intent.getStringExtra("passWord");

        //在屏幕中显示
        tvUserName.setText(userName);
        tvPassWord.setText(passWord);
    }
}