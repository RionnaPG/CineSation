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
public class TicketTypeDate {
    private MySQLConnector db;
    
    private List<TicketType> tTList = new ArrayList();
    
    public TicketTypeDate() throws SQLException
    {
        db = new MySQLConnector();
        
        getAlltt();
    }
    
    public void getAlltt() throws SQLException
    {
        getTypeList("SELECT * fROM ticket_type ORDER BY TicketTypeID");
    }
    
    public void getTypeList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);
        tTList.clear();
        while (rs.next())
        {
            TicketType scn = new TicketType();
            
            scn.setTypeID(rs.getInt("TicketTypeID"));
            scn.setType(rs.getString("TicketType"));
            scn.setTPrice(rs.getDouble("TPrice"));
            tTList.add(scn);
        }
    }
    
    public List getTTArray()
    {
        return this.tTList;
    }
}
