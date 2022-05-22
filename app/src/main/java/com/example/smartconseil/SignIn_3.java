package com.example.smartconseil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in3);
        Button signing=findViewById(R.id.signInBtn2);
        signing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            UsefullMethods.goToActivity(SignIn_3.this,SpaceChose.class);
            }
        });
    }
}