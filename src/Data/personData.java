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
public class personData {
    
    private MySQLConnector db;//links to MySQLConnector

    private List<person> userList = new ArrayList();//creates an array list of the class

    public personData() throws SQLException
    {
        db = new MySQLConnector(); //creates an object of MySQLConnector

        getAllUsers();//to call all data from class
    }

    public void getAllUsers() throws SQLException
    {
        getUsersList("SELECT * FROM person ORDER BY IDNumber");//orders list by primary key
    }
    
    public void getUsersList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);//running through access database,getting the values and putting them in rs
        userList.clear();//empties the list
        while (rs.next())//going through 
        {
            person ud = new person();
            ud.setID(rs.getString("IDNumber"));
            ud.setName(rs.getString("Name"));
            ud.setSurname(rs.getString("Surname"));
            ud.setEmail(rs.getString("Email"));
            ud.setContacNumber(rs.getString("ContactNumber"));
            ud.setDOB(rs.getString("Date_of_birth"));
            userList.add(ud);
        }
    }

    public person getUser(String idNumber)// checking before adding//only if primary key is not auto number)
    {
        person u = new person();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < userList.size())
        {
            u = userList.get(counter);
            if (u.getID().equalsIgnoreCase(idNumber))
            {
                found = true;
            }
            counter++;
        }
        return u;
    }
    
    public Boolean getPerson(String idNumber)// checking before adding//only if primary key is not auto number)
    {
        person u = new person();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < userList.size())
        {
            u = userList.get(counter);
            if (u.getID().equalsIgnoreCase(idNumber))
            {
                found = true;
            }
            counter++;
        }
        return found;
    }

    
    public void addUser(String idNumber, String name, String surname, String contactNumber, String email, String dob) throws SQLException//all fields except auto number
    {
        if (db.update("INSERT INTO person (IDNumber, Name, Surname, ContactNumber, Date_of_birth, Email) VALUES('" + idNumber + "','" + name  + "','" + surname +"','"+contactNumber+ "','" + dob +"','"+email+ "')") > 0)//insert into table name
        { 
            getAllUsers();
            JOptionPane.showMessageDialog(null, "User successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);//change name
        } else
        {
            JOptionPane.showMessageDialog(null, "User NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);//change name
        }
    }
    
    public List getUserArray()
    {
        return this.userList;
    }

    

    /*public void populateJTable(javax.swing.JTable userTable)//needed in all
    {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < userList.size(); i++)
        {
            Data.person u = userList.get(i);

            Object[] rowData =
            {
                u.getID(), u.getName(), u.getSurname(), u.getContactNumber(), u.getEmail(), u.getDOB()
            };
            model.addRow(rowData);
        }

        userTable.setModel(model);

        if (userTable.getRowCount() > 0)
        {
            userTable.setRowSelectionInterval(0, 0);
        }

    }*/
    
}
