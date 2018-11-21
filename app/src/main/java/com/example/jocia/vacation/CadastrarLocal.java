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

            EditText livro = (EditText)findViewById(R.id.editText);
            EditText autor = (EditText)findViewById(R.id.editText2);
            EditText editora = (EditText)findViewById(R.id.editText3);
            TextView id = findViewById(R.id.textView4);

            Cursor cursor = bancoController.carregaDadosById(Integer.parseInt(codigo));
            id.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ID)));
            livro.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.LOCAL)));
            autor.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.DESCRICAO)));
            editora.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ESTACAO)));
        }
    }

    public void onClickCadastrar(View view) {

        BancoController bancoController = new BancoController(getBaseContext());

        TextView id = findViewById(R.id.textView4);
        EditText titulo = findViewById(R.id.editText);
        EditText autor = findViewById(R.id.editText2);
        EditText editora = findViewById(R.id.editText3);

        String tituloString = titulo.getText().toString();
        String autorString = autor.getText().toString();
        String editoraString = editora.getText().toString();
        String idString = id.getText().toString();

        String resultado = "";

        if(idString == "") {
            resultado = bancoController.insereDado(tituloString, autorString, editoraString);
        }else{
            resultado = bancoController.alteraDado(idString, tituloString, autorString, editoraString);
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
