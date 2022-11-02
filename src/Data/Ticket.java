/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Rionna
 */
public class Ticket {
    private int tid, seatId, pid, screenID;
    
    public Ticket()
    {
        
    }
    
    public Ticket(int pid, int tid,int seatId, int screenId)
    {
        this.tid=tid;
        this.seatId=seatId;
        this.pid=pid;
        this.screenID=screenId;
    }
    
    
    public int getTicketID()
    {
        return tid;
    }
    
    public int getPID()
    {
        return pid;
    }
    
    public int getSeatID()
    {
        return seatId;
    }
    
    public int getScreenID()
    {
        return screenID;
    }
    
    public void setPid(int p)
    {
        this.pid=p;
    }
    public void setTicketid(int p)
    {
        this.tid=p;
    }
    public void setSeatid(int p)
    {
        this.seatId=p;
    }
    public void setScreenid(int p)
    {
        this.screenID=p;
    }
    
    @Override
    public String toString()
    {
        return "Ticket{"+"TicketID= "+tid+", ScreeningID="+screenID+", SeatID"+seatId+", PurchaseID="+pid+"}";
    }
    public void insertStmt() throws IOException
    {
        FileWriter my=new FileWriter("c:\\sql\\ticket.sql",true);
        my.write("\n"+"INSERT INTO ticket(ScreeningID,SeatID, PurchaseID) VALUES ("+screenID+","+seatId+","+pid+")"+"\n");
        my.close();
        //return ;
    }
}
