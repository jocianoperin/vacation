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
                }
            };

    @Override
    public void onClick(View v) {
        if (v == botao)
            showDialog(DATE_DIALOG_ID);
    }

    public void toLocal(View view) {

        Intent intent = new Intent(this, LocalActivity.class);
        startActivity(intent);
    }

}
