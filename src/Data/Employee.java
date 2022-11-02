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
public class Employee {
    private String idNumber;
    private String password;
    private Boolean isManager;
    
    
    public Employee()//creating a constructor to initialize class variables to null
    {

    }

    public Employee(String idNumber, String password, Boolean isManager)
    {
        this.idNumber = idNumber;
        this.password=password;
        this.isManager=isManager;
        
    }
    
    public String getEmpID()
    {
        return idNumber;
    }

    public String getEmpPassword()
    {
        return password;
    }

    public Boolean getManager()
    {
        return isManager;
    }


    public void setEmpID(String id)
    {
        this.idNumber = id;
    }

    public void setEmpPassword(String password)
    {
        this.password = password;
    }

    public void setManager(Boolean bool)
    {
        this.isManager = bool;
    }


    @Override
    public String toString()// formats and displays variables of this class
    {
        return "Employee{" + "eidDNumber=" + idNumber + ", Password=" + password + ", isManager=" + isManager + '}';
    }
}
