package com.example.jocia.vacation;

import com.example.jocia.vacation.R;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CadastrarLocal extends AppCompatActivity {

    String codigo = null;
    BancoController bancoController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_local);

        codigo = this.getIntent().getStringExtra("codigo");

        if(codigo != null){

            bancoController = new BancoController(getBaseContext());

            TextView id = findViewById(R.id.textView4);
            EditText local = (EditText)findViewById(R.id.editText);
            EditText descricao = (EditText)findViewById(R.id.editText2);
            EditText estacao = (EditText)findViewById(R.id.editText3);

            Cursor cursor = bancoController.carregaDadosById(Integer.parseInt(codigo));
            id.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ID)));
            local.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.LOCAL)));
            descricao.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.DESCRICAO)));
            estacao.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ESTACAO)));
        }
    }

    public void onClickCadastrar(View view) {

        BancoController bancoController = new BancoController(getBaseContext());

        TextView id = findViewById(R.id.textView4);
        EditText local = findViewById(R.id.editText);
        EditText descricao = findViewById(R.id.editText2);
        EditText estacao = findViewById(R.id.editText3);

        String localString = local.getText().toString();
        String descricaoString = descricao.getText().toString();
        String estacaoString = estacao.getText().toString();
        String idString = id.getText().toString();

        String resultado = "";

        if(idString == "") {
            resultado = bancoController.insereDado(localString, descricaoString, estacaoString);
        }else{
            resultado = bancoController.alteraDado(idString, localString, descricaoString, estacaoString);
        }

        Toast.makeText(getBaseContext(), resultado, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, ExibeLocal.class);
        startActivity(intent);
    }

    public void onClickExcluir(View view) {
        TextView id = findViewById(R.id.textView4);
        String idString = id.getText().toString();

        BancoController bancoController = new BancoController(getBaseContext());
        String resultado = bancoController.excluiRegistro(idString);

        Toast.makeText(getBaseContext(), resultado, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
