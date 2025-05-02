package edu.henrique.cursoNelioParte3.cursoNelioModulo34;



// JDBC - Java DataBase Connectivity (API padrão do JAVA para DB)


import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void application(){


        Connection conn = null; // Prepara a conexão com o banco
        PreparedStatement st = null;  // Faz a consulta dos dados

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(departmentId = ?)");

                st.setDouble(1,200);
                st.setInt(2, 2);

                int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);

        }
        catch(SQLException e ) {
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
