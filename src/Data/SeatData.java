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
public class SeatData {
    
    private MySQLConnector db;
    
    private List<Seat> seatList = new ArrayList();
    
    public SeatData() throws SQLException
    {
        db = new MySQLConnector();
        getAllSeat();
    }
    
    public void getAllSeat() throws SQLException
    {
        getSeatList("SELECT * FROM seat ORDER BY SeatID");
    }
    
    public void getSeatList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);//running through access database,getting the values and putting them in rs
        seatList.clear();//empties the list
        while (rs.next())//going through 
        {
            Seat sd = new Seat();
            sd.setSeatID(rs.getInt("SeatID"));
            sd.setCinemaID(rs.getInt("CinemaID"));
            sd.setSeatNum(rs.getInt("SeatNumber"));
            sd.setSeatRow(rs.getString("SeatRow"));
            seatList.add(sd);
        }
    } 
    
    public List getSeatArray()
    {
        return this.seatList;
    }
}
