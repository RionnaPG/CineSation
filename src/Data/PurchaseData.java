/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.sql.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Rionna
 */
public class PurchaseData {
    
    private MySQLConnector db;
    
    private List<Data.Purchase> PurchList = new ArrayList();
    
    public PurchaseData() throws SQLException{
        db = new MySQLConnector();
        getAllPurch();
    }
    
    public void getAllPurch() throws SQLException
    {
        getPurchList("SELECT * FROM purchase ORDER BY PurchaseID");//orders list by primary key
    }
    
    public void getPurchList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);//running through access database,getting the values and putting them in rs
        PurchList.clear();//empties the list
        while (rs.next())//going through 
        {
            Purchase pd = new Purchase();
            pd.setPid(rs.getInt("PurchaseID"));
            pd.setCid(rs.getString("eIDNumber"));
            pd.setEid(rs.getString("cIDNumber"));
            pd.setTotal(rs.getDouble("TotalCost"));
            pd.setDate(rs.getDate("pDate"));
            PurchList.add(pd);
        }
    }
    
    public void addPurchase(String eidNumber, String cidNumber) throws SQLException
    {
        
        if (db.update("INSERT INTO purchase (eIDNumber, cIDNumber) VALUES('" + eidNumber + "','" + cidNumber  + "')") > 0)//insert into table name
        { 
            getAllPurch();
            JOptionPane.showMessageDialog(null, "Purchase successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);//change name
        } else
        {
            JOptionPane.showMessageDialog(null, "Purchase NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);//change name
        }
    }
    
    public List getPurchArray()
    {
        return this.PurchList;
    }
    
    public void updateTotal(int pid, double total) throws SQLException
    {
        if (db.update("UPDATE purchase SET TotalCost = TotalCost+" + total + " WHERE PurchaseID = " + pid ) > 0)
        {
            getAllPurch();
            JOptionPane.showMessageDialog(null, "Points successfully added", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Points NOT added", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
