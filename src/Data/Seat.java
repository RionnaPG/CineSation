/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.*;
/**
 *
 * @author Rionna
 */
public class Seat {
    private int seatID, cinemaId, seatNumber;
    private String seatRow;
    
    
    public Seat()
    {
        
    }
    
    public Seat(int sid, int cid,int sNum, String sRow)
    {
        this.cinemaId=cid;
        this.seatID=sid;
        this.seatNumber=sNum;
        this.seatRow=sRow;
    }
    
    public int getSeatID()
    {
        return seatID;
    }
    
    public int getCinemaID()
    {
        return cinemaId;
    }
    
    public int getSeatNumber()
    {
        return seatNumber;
    }
    
    public String getSeatRow()
    {
        return seatRow;
    }
    
    public void setSeatID(int sid)
    {
        this.seatID=sid;
    }
    
    public void setCinemaID(int cid)
    {
        this.cinemaId=cid;
    }
    
    public void setSeatNum(int num)
    {
        this.seatNumber=num;
    }
    
    public void setSeatRow(String row)
    {
        this.seatRow=row;
    }
    @Override
    public String toString()
    {
       return "Seat{"+"SeatID= "+seatID+", CinemaID= "+cinemaId+", SeatNumber= "+seatNumber+", SeatRow= "+seatRow+"}";
    }
    
    
}
