package com.example.smartconseil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class SpaceChose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_chose);
        RelativeLayout btnParent=findViewById(R.id.btnParent);
        RelativeLayout btnChild=findViewById(R.id.BtnChild);
        btnParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // make it clickable
            }
        });
        btnChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UsefullMethods.goToActivity(SpaceChose.this,ChildDashboard.class);
            }
        });
    }
}