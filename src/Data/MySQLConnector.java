/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import java.sql.*;
/**
 *
 * @author Rionna
 */
public class MySQLConnector {
    
    Connection conn;
    
    public MySQLConnector() throws SQLException
    {
       System.out.println("coonecting to database..args.");
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinesation","root","Rionna@220044250");
            System.out.println("Connected");
        
            //conn.close();
        }
        catch(Exception e){
            System.out.println("Connection not established");
            e.printStackTrace();
            
        } 
    }
    
    public ResultSet query(String SQL) throws SQLException
    {
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(SQL);
        return result;
    }

    public int update(String SQL) throws SQLException
    {
        Statement stmt = conn.createStatement();
        int done = stmt.executeUpdate(SQL);
        return done;
    }
    
    public void closeDB() throws SQLException{
        conn.close();
    }
    
    
   
    
}
