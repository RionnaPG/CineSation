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
public class SnackData {
    
    private MySQLConnector db;
    
    private List<Snack> SnackList = new ArrayList();
    
    public SnackData() throws SQLException
    {
        db = new MySQLConnector();
        
        getAllSnack();
    }
    
    public void getAllSnack() throws SQLException
    {
        getSnkList("SELECT * fROM snack ORDER BY SnackID");
    }
    
    public void getSnkList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);
        SnackList.clear();
        while (rs.next())
        {
            Snack scn = new Snack();
            
            scn.setSnackID(rs.getInt("SnackID"));
            scn.setSnackName(rs.getString("SnackName"));
            scn.setSnackDesc(rs.getString("SnackDisc"));
            scn.setPrice(rs.getDouble("SnackPrice"));
            SnackList.add(scn);
        }
    }
    
    public List getSnkArray()
    {
        return this.SnackList;
    }
    
}
