package edu.henrique.cursoNelioParte3.cursoNelioModulo33;



// JDBC - Java DataBase Connectivity (API padrão do JAVA para DB)


import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void application(){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null; // Prepara a conexão com o banco
        PreparedStatement st = null;  // Faz a consulta dos dados

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    +"VALUES "
                    + "(?, ?, ?, ?, ? )",//Montou o esqueleto para setaros dados abaixo
                    Statement.RETURN_GENERATED_KEYS); //Retorna o Id para controle - Printa na linha 40

            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);



            /*
                st = conn.prepareStatement("INSERT INTO department (Name) values ('D1') ('D2')",
                Statement.RETURN_GENERATED_KEYS);  A ideia é retornar 2 ID's com uma inserção só (teste)
             */

            int rowsAffected = st.executeUpdate(); // Cria uma variavel rows e imputa nela quantas linhas serão alteradas para alimentar o executeUpdate

            if(rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys(); // É importante o if pq se fossem várias linhas afetadas, coletaria todas
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! ID = " + id);
                }
            }
            else{
                System.out.println("No rows affected");
            }
        }
        catch(SQLException e){
                e.printStackTrace();
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
