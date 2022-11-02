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
public class ScreeningData {
    
    private MySQLConnector db;
    
    private List<Screening> ScnList = new ArrayList();
    
    public ScreeningData() throws SQLException
    {
        db = new MySQLConnector();
        
        getAllScn();
    }
    
    public void getAllScn() throws SQLException
    {
        getScnList("SELECT * fROM screening ORDER BY ScreeningID");
    }
    
    public void getScnList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);
        ScnList.clear();
        while (rs.next())
        {
            Screening scn = new Screening();
            
            scn.setScrID(rs.getInt("ScreeningID"));
            scn.setTicketType(rs.getInt("TicketTypeID"));
            scn.setCinemaID(rs.getInt("CinemaID"));
            scn.setMovieID(rs.getInt("MovieID"));
            scn.setDate(rs.getString("sDate"));
            scn.setTime(rs.getString("sTime"));
            ScnList.add(scn);
        }
    }
    
    public List getScnArray()
    {
        return this.ScnList;
    }
    
    
}
