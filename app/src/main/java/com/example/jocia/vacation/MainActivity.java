package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLocal(View view) {

        Intent intent = new Intent(this, Local.class);
        startActivity(intent);
    }

    public void toData(View view) {

        Intent intent = new Intent(this, Data.class);
        startActivity(intent);
    }

}
