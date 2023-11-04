package com.example.vu_explicit_intents;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra("value");
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
