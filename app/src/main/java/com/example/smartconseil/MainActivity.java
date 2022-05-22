package com.example.smartconseil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout btnMail = findViewById(R.id.container);
        RelativeLayout btnGmail = findViewById(R.id.container2);
        RelativeLayout btnFacebook = findViewById(R.id.container3);
        TextView signup = findViewById(R.id.no_account_);

        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Make it Clickable
                UsefullMethods.goToActivity(MainActivity.this, SignIn_2.class);
            }
        });
        btnGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Make it Clickable
                UsefullMethods.goToActivity(MainActivity.this, SignIn_2.class);
            }
        });
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Make it Clickable
                UsefullMethods.goToActivity(MainActivity.this, SignIn_2.class);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Make Text Clickable
                UsefullMethods.goToActivity(MainActivity.this, SignIn_2.class);
            }
        });
    }
}