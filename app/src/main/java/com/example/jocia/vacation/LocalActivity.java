package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jocia.vacation.R;

import java.util.ArrayList;
import java.util.List;

public class LocalActivity extends AppCompatActivity {

    List<String> opcoes;
    ArrayAdapter<String> adaptador;
    ListView lvOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int estacao = this.getIntent().getExtras().getInt("estacao", 0);

        int destino = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        lvOpcoes = (ListView) findViewById(R.id.locais);

        opcoes = new ArrayList<String>();

        if (estacao == 1) {
            opcoes.add("Porto de Galinhas");
            opcoes.add("Morro de São Paulo");
            opcoes.add("Natal");

            adaptador = new ArrayAdapter<String>(LocalActivity.this, android.R.layout.simple_list_item_1, opcoes);
            lvOpcoes.setAdapter(adaptador);

            lvOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            destino(0);
                            break;
                        case 1:
                            destino(1);
                            break;
                        case 2:
                            destino(2);
                            break;
                    }
                }
            });

        }else if (estacao == 2){
            opcoes.add("Joinville");
            opcoes.add("Holambra");
            opcoes.add("Cunha");

            adaptador = new ArrayAdapter<String>(LocalActivity.this, android.R.layout.simple_list_item_1, opcoes);
            lvOpcoes.setAdapter(adaptador);

            lvOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            destino(3);
                            break;
                        case 1:
                            destino(4);
                            break;
                        case 2:
                            destino(5);
                            break;
                    }
                }
            });

        }else if (estacao == 3){
            opcoes.add("Bariloche");
            opcoes.add("Mendoza");
            opcoes.add("Santiago");

            adaptador = new ArrayAdapter<String>(LocalActivity.this, android.R.layout.simple_list_item_1, opcoes);
            lvOpcoes.setAdapter(adaptador);

            lvOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            destino(9);
                            break;
                        case 1:
                            destino(10);
                            break;
                        case 2:
                            destino(11);
                            break;
                    }
                }
            });

        }else if (estacao == 4){
            opcoes.add("Toscana");
            opcoes.add("Praga");
            opcoes.add("Hallstatt");

            adaptador = new ArrayAdapter<String>(LocalActivity.this, android.R.layout.simple_list_item_1, opcoes);
            lvOpcoes.setAdapter(adaptador);

            lvOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            destino(6);
                            break;
                        case 1:
                            destino(7);
                            break;
                        case 2:
                            destino(8);
                            break;
                    }
                }
            });

        }else {
            opcoes.add("Porto de Galinhas");
            opcoes.add("Morro de São Paulo");
            opcoes.add("Natal");
            opcoes.add("Joinville");
            opcoes.add("Holambra");
            opcoes.add("Cunha");
            opcoes.add("Toscana");
            opcoes.add("Praga");
            opcoes.add("Hallstatt");
            opcoes.add("Bariloche");
            opcoes.add("Mendoza");
            opcoes.add("Santiago");

            adaptador = new ArrayAdapter<String>(LocalActivity.this, android.R.layout.simple_list_item_1, opcoes);
            lvOpcoes.setAdapter(adaptador);

            lvOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            destino(0);
                            break;
                        case 1:
                            destino(1);
                            break;
                        case 2:
                            destino(2);
                            break;
                        case 3:
                            destino(3);
                            break;
                        case 4:
                            destino(4);
                            break;
                        case 5:
                            destino(5);
                            break;
                        case 6:
                            destino(6);
                            break;
                        case 7:
                            destino(7);
                            break;
                        case 8:
                            destino(8);
                            break;
                        case 9:
                            destino(9);
                            break;
                        case 10:
                            destino(10);
                            break;
                        case 11:
                            destino(11);
                            break;
                    }
                }
            });

        }


    }

    private void destino(int destino) {

        Intent intent = new Intent(this, DetalhesActivity.class);
        intent.putExtra("destino", destino);
        startActivity(intent);
    }

}

