package edu.henrique.cursoNelioParte3.cursoNelioModulo32;



// JDBC - Java DataBase Connectivity (API padrão do JAVA para DB)


import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void application(){


        Connection conn = null; // Prepara a conexão com o banco
        Statement st = null;  // Faz a consulta dos dados
        ResultSet rs = null;  // Recebe os dados e armazena nela mesma

        try{
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("SELECT * FROM department"); // O executeQuery deixa executar uma query no parametro

            while(rs.next()){
                System.out.println(rs.getInt("Id") +"," + rs.getString("Name")); // Usando o rs.getAlgo você pdoe coletar diretamente os campos, e como tem um next de parametro, ele vai caapturar até o próximo ser nulo
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally { // Como esses métodos não são chamados via JAVA JDK(Interno) se não fechar pode vazar memória e estourar, então o fuinally serve para isso, além de quê para evitar try/catch (Statements podem dar) eu tratei deles lá no DBClass
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection(); // A Mãe é minha inspiração.
        }





    }
}
