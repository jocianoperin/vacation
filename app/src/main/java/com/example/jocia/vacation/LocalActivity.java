package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class LocalActivity extends AppCompatActivity {

    List<String> opcoes;
    ArrayAdapter<String> adaptador;
    ListView lvOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);

        Intent intent = getIntent();
        final int id_estacao = (int) intent.getSerializableExtra("id_estacao");

        lvOpcoes = (ListView) findViewById(R.id.locais);

        opcoes = new ArrayList<String>();

        if (id_estacao == 0){
            opcoes.add("Holambra (SP) – Expoflora e plantações");
            opcoes.add("Cunha (SP) – Lavandário");
            opcoes.add("Nova Petrópolis (RS) – Festival da Primavera");
            opcoes.add("Destino3");
            opcoes.add("Destino4");
            opcoes.add("Destino5");
            opcoes.add("Destino6");
            opcoes.add("Destino7");
            opcoes.add("Destino8");
            opcoes.add("Destino9");
        }else if (id_estacao == 1){
            opcoes.add("Holambra (SP) – Expoflora e plantações");
            opcoes.add("Cunha (SP) – Lavandário");
            opcoes.add("Nova Petrópolis (RS) – Festival da Primavera");
        }else if (id_estacao == 2){
            opcoes.add("Destino3");
            opcoes.add("Destino4");
            opcoes.add("Destino5");
        }else if (id_estacao == 3){
            opcoes.add("Destino6");
            opcoes.add("Destino7");
            opcoes.add("Destino8");
        }else if (id_estacao == 4){
            opcoes.add("Destino9");
        }



        adaptador = new ArrayAdapter<String>(LocalActivity.this, android.R.layout.simple_list_item_1, opcoes);
        lvOpcoes.setAdapter(adaptador);
        lvOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (id_estacao == 0){
                    switch (position) {
                        case 0:
                            destino0();
                            break;
                        case 1:
                            destino1();
                            break;
                        case 2:
                            destino2();
                            break;
                        case 3:
                            destino3();
                            break;
                        case 4:
                            destino4();
                            break;
                        case 5:
                            destino5();
                            break;
                        case 6:
                            destino6();
                            break;
                        case 7:
                            destino7();
                            break;
                        case 8:
                            destino8();
                            break;
                        case 9:
                            destino9();
                            break;
                    }
                }else if (id_estacao == 1){
                    switch (position){
                        case 0:
                            destino0();
                            break;
                        case 1:
                            destino1();
                            break;
                        case 2:
                            destino2();
                            break;
                    }
                }else if (id_estacao == 2){
                    switch (position){
                        case 0:
                            destino3();
                            break;
                        case 1:
                            destino4();
                            break;
                        case 2:
                            destino5();
                            break;
                    }
                }else if (id_estacao == 3){
                    switch (position){
                        case 0:
                            destino6();
                            break;
                        case 1:
                            destino7();
                            break;
                        case 2:
                            destino8();
                            break;
                    }
                }else if (id_estacao == 4){
                    switch (position){
                        case 0:
                            destino9();
                            break;
                    }
                }
            }
        });
    }

    private void destino0() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Toast.makeText(this, "Selecionou destino0", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 0);
        startActivity(intent);
    }

    private void destino1() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");
        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 1);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino1", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino2() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");
        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 2);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino2", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino3() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 3);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino3", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino4() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 4);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino3", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino5() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 5);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino5", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino6() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 6);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino6", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino7() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 7);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino7", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino8() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 8);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino8", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }
    private void destino9() {
        PontosTuristicos criaPontos = new PontosTuristicos("Quedas do Iguaçu", "Verão");

        Intent intent = new Intent(LocalActivity.this, DetalhesActivity.class);
        intent.putExtra("destino_id", 9);
        startActivity(intent);

        Toast.makeText(this, "Selecionou destino9", Toast.LENGTH_SHORT).show();
//        Intent it = new Intent(LocalActivity.this, actSobre.class);
//        startActivity(it);
    }


}

