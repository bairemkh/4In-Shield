package com.example.smartconseil;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class UsefullMethods {
    public static void goToActivity(Context from,Class destination){
        Intent intent=new Intent(from,destination);
        from.startActivity(intent);
    }
}
