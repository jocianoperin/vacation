package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int estacao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLocal(View view) {

        Intent intent = new Intent(this, LocalActivity.class);
        intent.putExtra("estacao", estacao);
        startActivity(intent);
    }

    public void toData(View view) {

        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }

}
