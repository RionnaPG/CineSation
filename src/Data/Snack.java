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
public class Snack {
    private int snackID;
    private String sName, sDisc;
    private double sPrice;
    
    public Snack()
    {
        
    }
    
    public Snack(int id, String sName, String sDesc, double price)
    {
        this.snackID=id;
        this.sName=sName;
        this.sDisc=sDesc;
        this.sPrice=price;
    }
    
    public int getSnackID()
    {
        return snackID;
    }
    
    public String getSnackName()
    {
        return sName;
    }
    
    public String getSnackDesc()
    {
        return sDisc;
    }
    
  
    
    public double getPrice()
    {
        return  sPrice;
    }
    
    public void setSnackID(int p)
    {
        this.snackID=p;
    }
    
    public void setSnackName(String sName)
    {
        this.sName=sName;
    }
    public void setSnackDesc(String sDesc)
    {
        this.sDisc=sDesc;
    }
    
    public void setPrice(double t)
    {
        this.sPrice=t;
    }
    
    @Override
    public String toString()
    {
        return "Snack{"+"SnackID= "+snackID+", Name="+sName+", Description"+sDisc+", Price="+sPrice+"}";
    }
    
}
