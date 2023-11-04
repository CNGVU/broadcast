package com.example.vu_explicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_ac2, btn_CallBroadCastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_ac2 = findViewById(R.id.tv_activity_2);
        String message = getIntent().getStringExtra("Information");
        tv_ac2.setText(message);
        Intent intent = new Intent("my_action");
        intent.putExtra("value",message);
        sendBroadcast(intent);
        btn_CallBroadCastReceiver = findViewById(R.id.btn_CallBroadCastReceiver);
        btn_CallBroadCastReceiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyBroadCastReceiver m = new MyBroadCastReceiver();
                m.onReceive(v.getContext(),intent);
            }
        });

    }

}