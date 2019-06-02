package com.example.myapplication.database;

public class ScriptDLL {

    public static String getCreateTableItens(){

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS ITENS ");
        sql.append(" NOME VARCHAR (250) NOT NULL DEFAULT (''), ");
        sql.append(" PRECO VARCHAR (250) NOT NULL DEFAULT (''), ");
        sql.append(" DESCRICAO VARCHAR (250) NOT NULL DEFAULT ('') ");


        return sql.toString();
    }
}
