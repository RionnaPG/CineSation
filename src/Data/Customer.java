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
public class Customer {
    private String idNumber;
    private int points;
    
    
    public Customer()
    {
        
    }        
    public Customer(String idNumber, int points)
    {
        this.idNumber=idNumber;
        this.points= points;
        
    }
    
    
    public String getcID()
    {
        return idNumber;
    }
    
    
    
    public int getPoints()
    {
        return points;        
    }
    
    public void setid(String id)
    {
        this.idNumber=id;        
    }
    
    
    public void setPoints(int point)
    {
        this.points=point;
    }
    
    @Override
    public String toString()
    {
        return "Customer{" +"cIDNumber= " +idNumber+ ", Points= " +points+ "}";
    }
}
