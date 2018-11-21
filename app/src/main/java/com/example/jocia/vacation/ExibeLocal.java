package com.example.jocia.vacation;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.jocia.vacation.R;
import com.example.jocia.vacation.BancoController;
import com.example.jocia.vacation.CriaBanco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExibeLocal extends AppCompatActivity {

    private ListView lista;
    private String estacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_local);

        BancoController bancoController = new BancoController(getBaseContext());
        final Cursor cursor = bancoController.carregaDados();

        String[] nomeCampos = new String[]{CriaBanco.ID, CriaBanco.LOCAL};
        int[] idViews = new int[]{R.id.idLocal, R.id.tituloLocal};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getBaseContext(), R.layout.list_local_adapter, cursor,
                nomeCampos, idViews, 0);

        lista = findViewById(R.id.lvToDoList);
        lista.setAdapter(adapter);

        if (estacao == "Verão") {

        } else if (estacao == "Primavera") {

        } else if (estacao == "Outuno") {

        } else if (estacao == "Inverno") {

        } else {

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    String codigo = "";
                    cursor.moveToPosition(i);

                    codigo = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ID));

                    Intent intent = new Intent(getBaseContext(), CadastrarLocal.class);

                    Bundle params = new Bundle();
                    params.putString("codigo", codigo);

                    intent.putExtras(params);

                    startActivity(intent);
                }
            });
        }
    }

    public void onClickAdd(View view) {

        Intent intent = new Intent(this, CadastrarLocal.class);
        startActivity(intent);
    }

}
