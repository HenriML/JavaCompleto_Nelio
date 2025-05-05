package edu.henrique.cursoNelioParte3.cursoNelioModulo36;

// Tem que tomar cuidado ao apagar dados devido a questão de chave primária e estrangeira no SQL

// JDBC - Java DataBase Connectivity (API padrão do JAVA para DB)

// DAO - Data Access Object - É a porta de acesso dos objetos no código com as entidades no banco permitindo o CRUD.
import db.DB;
import db.DBIntegrityException;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void application(){


        Connection conn = null; // Prepara a conexão com o banco
        Statement st = null;  // Faz a consulta dos dados

        try{
            conn = DB.getConnection();
            conn.setAutoCommit(false); // Todas as operações ficam pendentes de uma confirmação explicita do dev
            st = conn.createStatement();


            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1 ");

            /*
            int x = 1;
            if(x < 2){
                throw new SQLException("Fake error");
            }
            */
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2 ");

            conn.commit();

            System.out.println("rows1" + rows1);
            System.out.println("rows2" + rows2);


        }
        catch(SQLException e ) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back!  Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback!  Caused by: " + e.getMessage());
            }
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
