package com.example.a1028demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUserName,edPassword;
    Button btnLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edUserName = findViewById(R.id.userName);
        edPassword = findViewById(R.id.passWord);
        btnLog = findViewById(R.id.log_btn);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edUserName.getText().toString();
                String passWord = edPassword.getText().toString();
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("passWord", passWord);
                //正确的账号密码 wangyong 123456
                Log.d("账号", userName);
                Log.d("密码", passWord);

                if ("wangyong".equals(userName) && "123456".equals(passWord)){
                    Log.d("android","登录成功");
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Log.d("android", "登录失败");
                    CharSequence text = "账号或密码错误";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context,text,duration).show();
                }

            }
        });


        //两个button之间的跳转
        Button button2 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity2.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}