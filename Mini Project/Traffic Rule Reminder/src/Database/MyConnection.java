/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Shubham
 */
import java.sql.*;
public class MyConnection {
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject?zeroDateTimeBehavior=CONVERT_TO_NULL","root","admin");
            return con;
        } 
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
 