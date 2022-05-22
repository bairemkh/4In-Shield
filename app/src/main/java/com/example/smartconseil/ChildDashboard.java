package com.example.smartconseil;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.smartconseil.Fragments.DashboardFragment;
import com.gauravk.bubblenavigation.BubbleNavigationLinearView;

public class ChildDashboard extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_dashboard);
        FrameLayout frameLayout=findViewById(R.id.frameContainer);
        BubbleNavigationLinearView tabBar=findViewById(R.id.tabBarApp);
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameContainer,new DashboardFragment());
        fragmentTransaction.commit();
    }
}