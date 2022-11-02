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
public class movieData {
    private MySQLConnector db;
    
    private List<movie> movieList = new ArrayList();
    
    public movieData () throws SQLException
    {
        db = new MySQLConnector();
        
        getAllMovies();
    }
    
    public void getAllMovies() throws SQLException
    {
        getMovieList("SELECT * fROM movie ORDER BY movieID");
    }
    
    public void getMovieList(String sql) throws SQLException
    {
        ResultSet rs = db.query(sql);
        movieList.clear();
        while (rs.next())
        {
            movie scn = new movie();
            
            scn.setMovieID(rs.getInt("MovieID"));
            scn.setDuration(rs.getInt("Duration"));
            scn.setCast(rs.getString("Cast"));
            scn.setDirector(rs.getString("Director"));
            scn.setGenre(rs.getString("Genre"));
            scn.setTitle(rs.getString("Title"));
            scn.setSynopis(rs.getString("Synopis"));
            movieList.add(scn);
        }
    }
    
    public List getMovieArray()
    {
        return this.movieList;
    }
}
