/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Data.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Rionna
 */
public class TicketData {
    private MySQLConnector db;
    
    private List<Ticket> TicketList = new ArrayList();
    
    public TicketData() throws SQLException{
        db = new MySQLConnector();
        getAllTicket();
    }
    
    public void getAllTicket() throws SQLException
    {
        getTicketList("SELECT * FROM ticket ORDER BY TicketID");//orders list by primary key
    }
    
    public void getTicketList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);//running through access database,getting the values and putting them in rs
        TicketList.clear();//empties the list
        while (rs.next())//going through 
        {
            Ticket pd = new Ticket();
            pd.setTicketid(rs.getInt("TicketID"));
            pd.setScreenid(rs.getInt("ScreeningID"));
            pd.setSeatid(rs.getInt("SeatID"));
            pd.setPid(rs.getInt("PurchaseID"));
            TicketList.add(pd);
        }
    }
    
    public void addTicket(int scnId, int seatId, int pId) throws SQLException
    {
        
        
        if (db.update("INSERT INTO ticket (ScreeningID, SeatID, PurchaseID) VALUES(" + scnId + "," + seatId  + "," + pId + ")") > 0)//insert into table name
        { 
            getAllTicket();
            JOptionPane.showMessageDialog(null, "Ticket successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);//change name
        } else
        {
            JOptionPane.showMessageDialog(null, "Ticket NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);//change name
        }
    }
    
    public List getTicketArray()
    {
        return this.TicketList;
    }
}
