package edu.henrique.cursoNelioParte3.cursoNelioModulo31;



// JDBC - Java DataBase Connectivity (API padrão do JAVA para DB)


import db.DB;

import java.sql.Connection;

public class Program {
    public static void application(){


        Connection conn = DB.getConnection();
        DB.closeConnection();


    }
}
