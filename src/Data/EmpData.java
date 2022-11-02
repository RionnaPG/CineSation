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
public class EmpData {
    private MySQLConnector db;
    private List<Employee> empList= new ArrayList();
    
    public EmpData() throws SQLException
    {
        db= new MySQLConnector();
        
        getAllEmp();
    }
    
    public void getAllEmp() throws SQLException
    {
        getEmpList("SELECT * FROM employee ORDER BY eIDNumber");
        
    }
    
    public void getEmpList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);//running through access database,getting the values and putting them in rs
        empList.clear();//empties the list
        while (rs.next())//going through 
        {
            Employee ed= new Employee();
            
            ed.setEmpID(rs.getString("eIDNumber"));
            ed.setEmpPassword(rs.getString("password"));
            ed.setManager(rs.getBoolean("IsManager"));
            
            empList.add(ed);
        }
    }
    
    public void addEmployee(String idNumber) throws SQLException//all fields except auto number
    {
        if (db.update("INSERT INTO employee (eIDNumber) VALUES('" + idNumber + "')") > 0)//insert into table name
        {//single quotes for string in SQL
            //use a comented example to check quotes
            getAllEmp();
            JOptionPane.showMessageDialog(null, "Employee successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Employee NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List getEmpArray()
    {
        return this.empList;
    }
    
    public void changePassword(String idNumber,String password) throws SQLException
    {
         if (db.update("UPDATE employee SET password = '" + password + "' WHERE eIDNumber = '" + idNumber + "'") > 0)
        {
            getAllEmp();
            JOptionPane.showMessageDialog(null, "Password successfully changed", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Password NOT changed", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public Boolean getEmp(String idNumber)// checking before adding//only if primary key is not auto number)
    {
        Employee u = new Employee();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < empList.size())
        {
            u = empList.get(counter);
            if (u.getEmpID().equalsIgnoreCase(idNumber))
            {
                found = true;
            }
            counter++;
        }
        return found;
    }
}
