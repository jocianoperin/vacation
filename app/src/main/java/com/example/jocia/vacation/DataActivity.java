package com.example.jocia.vacation;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.jocia.vacation.R;
import com.example.jocia.vacation.R;


public class DataActivity extends AppCompatActivity {

    private String estacao;
    Intent intent = new Intent(this, LocalActivity.class);

    private String[] meses = new String[]{"","Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        final Spinner combo = findViewById(R.id.comboMes);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.select_dialog_item, meses);

        combo.setAdapter(adapter);

        Intent intent = new Intent(this, LocalActivity.class);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int index, long l) {

                switch (index) {
                    case 0:
                        Toast.makeText(DataActivity.this, "Nenhum local selecionado",
                                Toast.LENGTH_SHORT).show();
                        estacao = "";
                        break;
                    case 1:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Verão";
                        break;
                    case 2:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Verão";
                        break;
                    case 3:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Verão";
                        break;
                    case 4:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Outono";
                        break;
                    case 5:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Outono";
                        break;
                    case 6:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Outono";
                        break;
                    case 7:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Inverno";
                        break;
                    case 8:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Inverno";
                        break;
                    case 9:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Inverno";
                        break;
                    case 10:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Primavera";
                        break;
                    case 11:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Primavera";
                        break;
                    case 12:
                        Toast.makeText(DataActivity.this, adapterView.getSelectedItem().toString(),
                                Toast.LENGTH_SHORT).show();
                        estacao = "Primavera";
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(DataActivity.this, "Nenhum mês selecionado",
                        Toast.LENGTH_SHORT).show();
                estacao = "";
            }
        });

    }

    public void toLocal(View view) {

        Intent intent = new Intent(this, LocalActivity.class);
        intent.putExtra("estacao", estacao);
        startActivity(intent);
    }
}
