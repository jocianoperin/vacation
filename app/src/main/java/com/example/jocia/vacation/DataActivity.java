package com.example.jocia.vacation;


import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;


public class DataActivity extends Activity implements Button.OnClickListener {

    private Button botao;
    private Button botao2;
    int month;

    static final int DATE_DIALOG_ID = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        botao = (Button) findViewById(R.id.btnDataInicio);
        botao.setOnClickListener(this);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Calendar calendario = Calendar.getInstance();

        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        switch (id) {
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this, mDateSetListener, ano, mes,
                        dia);
        }

        return null;
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear,
                                      int dayOfMonth) {
                    String data = String.valueOf(dayOfMonth) + " /"
                            + String.valueOf(monthOfYear+1) + " /" + String.valueOf(year);
                    Toast.makeText(DataActivity.this,
                            "DATA = " + data, Toast.LENGTH_SHORT).show();
                    int estacao = converteMes(monthOfYear);
                    if (estacao == 1){
                        estacao1();
                    }else if (estacao == 2){
                        estacao2();
                    }else if (estacao == 3){
                        estacao3();
                    }else if (estacao == 4){
                        estacao4();
                    }

                }
            };

    @Override
    public void onClick(View v) {
        if (v == botao){
            showDialog(DATE_DIALOG_ID);
        }
    }

    public void toLocal(View view) {

        Intent intent = new Intent(this, LocalActivity.class);
        intent.putExtra("id_estacao", 0);
        startActivity(intent);
    }

    public int converteMes(int mes) {
        int estacao=0;
        if (mes >= 0 && mes <= 2) {
            //verao
            estacao = 2;
            return estacao;
        } else if (mes >= 3 && mes <= 5) {
            //outono
            estacao = 3;
            return estacao;
        } else if (mes >= 6 && mes <= 8) {
            //inverno
            estacao = 4;
            return estacao;
        } else if (mes >= 9 && mes <= 11) {
            //primavera
            estacao = 1;
            return estacao;
        }
        return 0;
    }

    private void estacao1() {
        Intent intent = new Intent(this, LocalActivity.class);
        intent.putExtra("id_estacao", 1);
        startActivity(intent);
    }
    private void estacao2() {
        Intent intent = new Intent(this, LocalActivity.class);
        intent.putExtra("id_estacao", 2);
        startActivity(intent);
    }
    private void estacao3() {
        Intent intent = new Intent(this, LocalActivity.class);
        intent.putExtra("id_estacao", 3);
        startActivity(intent);
    }
    private void estacao4() {
        Intent intent = new Intent(this, LocalActivity.class);
        intent.putExtra("id_estacao", 4);
        startActivity(intent);
    }

}