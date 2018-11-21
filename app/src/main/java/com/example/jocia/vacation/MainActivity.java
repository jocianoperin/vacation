package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jocia.vacation.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toCadastrar(View view) {

        Intent intent = new Intent(this, CadastrarLocal.class);
        startActivity(intent);
    }

    public void toBuscar(View view) {

        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }

    public void toListar(View view) {

        Intent intent = new Intent(this, ExibeLocal.class);
        startActivity(intent);
    }
}
