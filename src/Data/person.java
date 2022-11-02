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
public class person {
    
    private String idNumber;
    private String name;
    private String surname;
    private String contactNumber;
    private String email;
    private String dob;
    
    
    public person()//creating a constructor to initialize class variables to null
    {

    }

    public person(String idNumber, String name, String surname, String contactNumber, String email, String dob)
    {
        this.idNumber = idNumber;
        this.name=name;
        this.surname=surname;
        this.contactNumber=contactNumber;
        this.email=email;
        this.dob=dob;
        
    }
    
    public String getID()
    {
        return idNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getEmail()
    {
        return email;
    }
    
    public String getContactNumber()
    {
        return contactNumber;
    }

    public String getDOB()
    {
        return dob;
    }

    public void setID(String id)
    {
        this.idNumber = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setContacNumber(String cn)
    {
        this.contactNumber = cn;
    }
    
    public void setDOB(String dob)
    {
        this.dob=dob;
    }

    @Override
    public String toString()// formats and displays variables of this class
    {
        return "Person{" + "idDNumber=" + idNumber + ", name=" + name + ", surname=" + surname + ", ContactNumber=" + contactNumber + ", DateOfBirth=" + dob +", Email =" + email + '}';
    }
}
