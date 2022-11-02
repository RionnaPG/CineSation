/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Data.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Rionna
 */
public class CustomerData {
    private MySQLConnector db;
    private List<Customer> custList = new ArrayList();
    
    public CustomerData() throws SQLException
    {
        db= new MySQLConnector();
        
        getAllCust();
    }
    
    public void getAllCust() throws SQLException
    {
        getCustList("SELECT * FROM customer ORDER BY cIDNumber");//orders list by primary key
    }
    
    public void getCustList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);//running through access database,getting the values and putting them in rs
        custList.clear();//empties the list
        while (rs.next())//going through 
        {
            Customer cd = new Customer();
            cd.setid(rs.getString("cIDNumber"));
            cd.setPoints(rs.getInt("Points"));
            custList.add(cd);
        }
    }
    
    public void addCustomer(String id) throws SQLException
    {
        if (db.update("INSERT INTO customer (cIDNumber) VALUES('" + id + "')") > 0)//insert into table name
        {//single quotes for string in SQL
            //use a comented example to check quotes
            getAllCust();
            JOptionPane.showMessageDialog(null, "Customer successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);//change name
        } else
        {
            JOptionPane.showMessageDialog(null, "Customer NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);//change name
        }
    }
    
    public List getCustArray()
    {
        return this.custList;
    }
    
    public void addPoints(String idNumber,int points) throws SQLException
    {
         if (db.update("UPDATE customer SET Points = Points+" + points + " WHERE cIDNumber = '" + idNumber + "'") > 0)
        {
            getAllCust();
            JOptionPane.showMessageDialog(null, "Points successfully added", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Points NOT added", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Boolean getCustomer(String idNumber)// checking before adding//only if primary key is not auto number)
    {
        Customer u = new Customer();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < custList.size())
        {
            u = custList.get(counter);
            if (u.getcID().equalsIgnoreCase(idNumber))
            {
                found = true;
            }
            counter++;
        }
        return found;
    }
    
    public Customer getCustomerData(String idNumber)// checking before adding//only if primary key is not auto number)
    {
        Customer u = new Customer();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < custList.size())
        {
            u = custList.get(counter);
            if (u.getcID().equalsIgnoreCase(idNumber))
            {
                found = true;
            }
            counter++;
        }
        return u;
    }
}
