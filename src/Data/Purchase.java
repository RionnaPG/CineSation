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
public class Purchase {
    private int pId;
    private String eId, cId;
    private Date pDate;
    private double total;
    
    public Purchase()
    {
        
    }
    
    public Purchase(int pid, String eid, String cid, Date date, double total)
    {
        this.pId=pid;
        this.eId=eid;
        this.cId=cid;
        this.pDate=date;
        this.total=total;
    }
    
    public int getPurchID()
    {
        return pId;
    }
    
    public String getEmpID()
    {
        return eId;
    }
    
    public String getCustID()
    {
        return cId;
    }
    
    public Date getPurchDate()
    {
        return pDate;
    }
    
    public double getTotal()
    {
        return  total;
    }
    
    public void setPid(int p)
    {
        this.pId=p;
    }
    
    public void setEid(String eid)
    {
        this.eId=eid;
    }
    public void setCid(String cid)
    {
        this.cId=cid;
    }
    public void setDate(Date dDate)
    {
        this.pDate=dDate;
    }
    
    public void setTotal(double t)
    {
        this.total=t;
    }
    
    @Override
    public String toString()
    {
        return "Purchase{"+"PurchaseID= "+pId+", CustomerID="+cId+", EmployeeID"+eId+", Date="+pDate+", Total="+total+"}";
    }
    public void insertP() throws IOException
    {
        FileWriter my=new FileWriter("c:\\sql\\purchase.sql",true);
        my.write("\n"+"INSERT INTO purchase (eIDNumber, cIDNumber) VALUES('" + eId + "','" + cId  + "')"+"\n");
        my.close();
        //return ;
    }
    
    
}
