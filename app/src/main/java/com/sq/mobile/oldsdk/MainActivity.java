package com.sq.mobile.oldsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sq.mobile.sqsdk.SqWanCore;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SqWanCore.getInstance().init();

        findViewById(R.id.bt_login).setOnClickListener(this);
        findViewById(R.id.bt_pay).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                SqWanCore.getInstance().login();
                Toast.makeText(this, "login", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_pay:
                SqWanCore.getInstance().pay();
                Toast.makeText(this, "pay", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
