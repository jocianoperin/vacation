package com.example.jocia.vacation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {

    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoController(Context context){

        banco = new CriaBanco(context);
    }

    public String insereDado(String titulo, String autor, String editora){

        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.LOCAL, titulo);
        valores.put(CriaBanco.DESCRICAO, autor);
        valores.put(CriaBanco.ESTACAO, editora);

        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

        if(resultado == -1)
            return "Erro ao inserir registro";
        else
            return "Registro inserido com sucesso";
    }

    public Cursor carregaDados(){

        Cursor cursor;

        String[] campos = {banco.LOCAL, banco.ESTACAO, banco.ID};

        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, null, null, null, null, banco.ID);

        if(cursor != null){
            cursor.moveToFirst();
        }
        db.close();

        return cursor;
    }

    public Cursor carregaDadosById(int id){

        Cursor cursor;

        String[] campos = {banco.ID, banco.LOCAL, banco.DESCRICAO, banco.ESTACAO};
        String where = banco.ID + "=?";
        String[] args = {String.valueOf(id)};

        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, where, args, null, null, banco.ID);

        if(cursor != null){
            cursor.moveToFirst();
        }
        db.close();

        return cursor;
    }

    public String alteraDado(String id, String titulo, String autor, String editora) {
        ContentValues valores;
        String where;

        db = banco.getWritableDatabase();

        where = CriaBanco.ID + "=?";
        String[] args = new String[]{id};

        valores = new ContentValues();
        valores.put(CriaBanco.LOCAL, titulo);
        valores.put(CriaBanco.DESCRICAO, autor);
        valores.put(CriaBanco.ESTACAO, editora);

        long resultado = db.update(CriaBanco.TABELA, valores, where, args);
        db.close();

        if(resultado == -1)
            return "Erro ao alterar registro";
        else
            return "Registro alterado com sucesso";
    }

    public String excluiRegistro(String idString) {

        String where = banco.ID + "=?";

        db = banco.getReadableDatabase();
        long resultado = db.delete(banco.TABELA, where, new String[]{idString});
        db.close();


        if(resultado == -1)
            return "Erro ao excluir registro";
        else
            return "Registro excluído com sucesso";
    }
}
