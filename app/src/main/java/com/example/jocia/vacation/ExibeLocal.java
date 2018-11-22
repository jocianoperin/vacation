package com.example.jocia.vacation;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.jocia.vacation.R;
import com.example.jocia.vacation.BancoController;
import com.example.jocia.vacation.CriaBanco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ExibeLocal extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_local);

        BancoController bancoController = new BancoController(getBaseContext());
        final Cursor cursor = bancoController.carregaDados();

        String[] nomeCampos = new String[]{CriaBanco.LOCAL, CriaBanco.ESTACAO};
        int[] idViews = new int[]{R.id.tituloLocal, R.id.estacaoLocal};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getBaseContext(), R.layout.list_local_adapter, cursor,
                nomeCampos, idViews, 0);

        lista = findViewById(R.id.lvToDoList);
        lista.setAdapter(adapter);


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

      registerForContextMenu(lista);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;

        final int idd = (int) lista.getItemIdAtPosition(info.position);

        MenuItem deletar = menu.add("Deletar");
        deletar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
//                TextView id = findViewById(R.id.textView4);

                String idString = String.valueOf(idd);

                BancoController bancoController = new BancoController(getBaseContext());
                String resultado = bancoController.excluiRegistro(idString);

                Toast.makeText(getBaseContext(), resultado, Toast.LENGTH_SHORT).show();
                finish();


                return false;
            }
        });
    }


    public void onClickAdd(View view) {

        Intent intent = new Intent(this, CadastrarLocal.class);
        startActivity(intent);
    }


}
