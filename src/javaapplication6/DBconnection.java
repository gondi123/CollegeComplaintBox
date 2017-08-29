/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author K SHIVARAM TEJA
 */
public class DBconnection {
    Connection DBconnection;
public    Connection connect1()
    {
        try{
        Class.forName("com.mysql.jdbc.driver");
        System.out.println("connection success");
        
    }catch(Exception e)
    {
     System.out.println("error="+e);   
    }
    String url="jdbc:mysql://localhost:3306/connect";
            
    try{
        DBconnection=(Connection)DriverManager.getConnection(url,"root","1234");
        System.out.println("connection");
        
    }
    catch(Exception e)
    {

        System.out.println("error="+e);
    }
    return DBconnection;
    }

   }
    
    
    
