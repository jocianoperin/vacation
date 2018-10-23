package com.example.jocia.vacation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Local extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);

        PontosTuristicos[] criaPontos = new PontosTuristicos[10];

        criaPontos[0] = new PontosTuristicos("Quedas do Iguaçu", "Verão");
        criaPontos[1] = new PontosTuristicos("Dois Vizinhos", "Verão");
        criaPontos[2] = new PontosTuristicos("Quedas do Iguaçu", "Primavera");
        criaPontos[3] = new PontosTuristicos("Dois Vizinhos", "Primavera");
        criaPontos[4] = new PontosTuristicos("Quedas do Iguaçu", "Outono");
        criaPontos[5] = new PontosTuristicos("Dois Vizinhos", "Outono");
        criaPontos[6] = new PontosTuristicos("Quedas do Iguaçu", "Inverno");
        criaPontos[7] = new PontosTuristicos("Dois Vizinhos", "Inverno");
        criaPontos[8] = new PontosTuristicos("Quedas do Iguaçu", "Verão");
        criaPontos[9] = new PontosTuristicos("Dois Vizinhos", "Verão");

    }

}
