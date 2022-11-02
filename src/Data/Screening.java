/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Rionna
 */
public class Screening {
    
    private int scrID, ticketType, movieId,cid;
    private String sDate, sTime;
    
    public Screening()
    {
        
    }
    
    public Screening(int sid, int tt, int mid, int cid, String sDate, String time )
    {
        this.scrID=sid;
        this.movieId=mid;
        this.cid=cid;
        this.ticketType=tt;
        this.sDate=sDate;
        this.sTime=time;
    }
    
    public int getScnID()
    {
        return scrID;
    }
    
    public int getTickType()
    {
        return ticketType;
    }
    
    public int getMovieID()
    {
        return movieId;
    }
    
    public int getCinemaID()
    {
        return cid;
    }
    
    public String getDate()
    {
        return sDate;
    }
    
    public String getTime()
    {
        return sTime;
    }
    
    public void setScrID(int sid)
    {
        this.scrID=sid;
    }
    
    public void setCinemaID(int cid)
    {
        this.cid=cid;
    }
    
    public void setTicketType(int tt)
    {
        this.ticketType=tt;
    }
    public void setMovieID(int mid)
    {
        this.movieId=mid;
    }
    public void setDate(String date)
    {
        this.sDate=date;
    }
    public void setTime(String time)
    {
        this.sTime=time;
    }
    
    public String toString()
    {
        return "Screening{"+"ScreeningID= "+scrID+", TicketType= "+ticketType+", MovieID= "+movieId+", CinemaID= "+cid+", sDate="+sDate+", sTime= "+sTime+"}";
    }
}
