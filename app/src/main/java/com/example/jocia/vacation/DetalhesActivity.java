package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DetalhesActivity extends AppCompatActivity {

//    private TextView detalhesLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent intent = getIntent();
        int id_destino = (int) intent.getSerializableExtra("destino_id");

        TextView detalhesLocal = (TextView) findViewById(R.id.detalhes_txt);

        if (id_destino == 0){
            detalhesLocal.setText(R.string.destino0);
        }else if (id_destino == 1){
            detalhesLocal.setText(R.string.destino1);
        }else if (id_destino == 2){
            detalhesLocal.setText(R.string.destino2);
        }else if (id_destino == 3){
            detalhesLocal.setText(R.string.destino3);
        }else if (id_destino == 4){
            detalhesLocal.setText(R.string.destino4);
        }else if (id_destino == 5){
            detalhesLocal.setText(R.string.destino5);
        }else if (id_destino == 6){
            detalhesLocal.setText(R.string.destino6);
        }else if (id_destino == 7){
            detalhesLocal.setText(R.string.destino7);
        }else if (id_destino == 8){
            detalhesLocal.setText(R.string.destino8);
        }else if (id_destino == 9){
            detalhesLocal.setText(R.string.destino9);
        }else if (id_destino == 10){
            detalhesLocal.setText(R.string.destino10);
        }else if (id_destino == 11){
            detalhesLocal.setText(R.string.destino11);
        }



    }
}
