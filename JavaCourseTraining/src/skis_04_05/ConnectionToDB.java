/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skis_04_05;

import java.sql.*;

/**
 *
 * @author Big Boss
 */
public class ConnectionToDB {
    public static void openDB(){
        Connection c = null;
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:skiem.sqlite");
        }
        catch( Exception e ){
            System.err.println( e.getClass().getName() + " : " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
