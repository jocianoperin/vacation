package com.example.jocia.vacation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Local extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Local");

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }

    @Override
    public void onBackPressed(){ //Botão BACK padrão do android
        startActivity(new Intent(this, MainActivity.class)); //O efeito ao ser pressionado do botão (no caso abre a activity)
        finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
        return;
    }
}
