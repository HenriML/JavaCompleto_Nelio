package edu.henrique.cursoNelioParte3.cursoNelioModulo35;

// Tem que tomar cuidado ao apagar dados devido a questão de chave primária e estrangeira no SQL

// JDBC - Java DataBase Connectivity (API padrão do JAVA para DB)


import db.DB;
import db.DBIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void application(){


        Connection conn = null; // Prepara a conexão com o banco
        PreparedStatement st = null;  // Faz a consulta dos dados

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?");

            st.setInt(1,2);

                int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);

        }
        catch(SQLException e ) {
            throw new DBIntegrityException(e.getMessage()); // Dá para capturar uma exceção padrão e lançar uma própria e não apenas exibir stacktrace
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
