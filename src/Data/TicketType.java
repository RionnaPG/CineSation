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
public class TicketType {
    private int tTypeId;
    private String tType;
    private double tPrice;
    
    public TicketType()
    {
        
    }
    
    public TicketType(int id, String stype, double price)
    {
        this.tTypeId=id;
        this.tType=stype;
        this.tPrice=price;
    }
    
    public int getTypeID()
    {
        return tTypeId;
    }
    
    public String getType()
    {
        return tType;
    }
    
    public double getTicketPrice()
    {
        return  tPrice;
    }
    
    public void setTypeID(int p)
    {
        this.tTypeId=p;
    }
    
    public void setType(String sName)
    {
        this.tType=sName;
    }
   
    
    public void setTPrice(double t)
    {
        this.tPrice=t;
    }
    
    @Override
    public String toString()
    {
        return "TicketType{"+"TicketTypeID= "+tTypeId+", TicketType="+tType+",Price="+tPrice+"}";
    }
    
}
