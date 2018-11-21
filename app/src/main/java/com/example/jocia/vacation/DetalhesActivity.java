package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jocia.vacation.R;


public class DetalhesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent intent = getIntent();
        int id_destino = intent.getExtras().getInt("destino", 0);

        TextView detalhesLocal = (TextView) findViewById(R.id.detalhes_txt);
        ImageView imagemLocal = findViewById(R.id.detalhes_img);

        if (id_destino == 0){
            detalhesLocal.setText(R.string.destino0);
            imagemLocal.setImageResource(R.mipmap.galinhas);
        }else if (id_destino == 1){
            detalhesLocal.setText(R.string.destino1);
            imagemLocal.setImageResource(R.mipmap.morro);
        }else if (id_destino == 2){
            detalhesLocal.setText(R.string.destino2);
            imagemLocal.setImageResource(R.mipmap.natal);
        }else if (id_destino == 3){
            detalhesLocal.setText(R.string.destino3);
            imagemLocal.setImageResource(R.mipmap.joinville);
        }else if (id_destino == 4){
            detalhesLocal.setText(R.string.destino4);
            imagemLocal.setImageResource(R.mipmap.holambra);
        }else if (id_destino == 5){
            detalhesLocal.setText(R.string.destino5);
            imagemLocal.setImageResource(R.mipmap.cunha);
        }else if (id_destino == 6){
            detalhesLocal.setText(R.string.destino6);
            imagemLocal.setImageResource(R.mipmap.toscana);
        }else if (id_destino == 7){
            detalhesLocal.setText(R.string.destino7);
            imagemLocal.setImageResource(R.mipmap.praga);
        }else if (id_destino == 8){
            detalhesLocal.setText(R.string.destino8);
            imagemLocal.setImageResource(R.mipmap.hallstat);
        }else if (id_destino == 9){
            detalhesLocal.setText(R.string.destino9);
            imagemLocal.setImageResource(R.mipmap.bariloche);
        }else if (id_destino == 10){
            detalhesLocal.setText(R.string.destino10);
            imagemLocal.setImageResource(R.mipmap.mendoza);
        }else if (id_destino == 11){
            detalhesLocal.setText(R.string.destino11);
            imagemLocal.setImageResource(R.mipmap.santiago);
        }



    }
}
