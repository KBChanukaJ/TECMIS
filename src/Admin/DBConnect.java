/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author warun
 */
public class DBConnect {
    
    Connection con;
    //ResultSet rs;
    
    
    public Connection getCon(){
        return con;
    }
    
    //public ResultSet getSet(){
      //  return  rs;
    //}
    
    public void setCon(Connection con){
        this.con=con;
    }
    //Variable declearation
    private static final String _CONURL_="jdbc:mysql://localhost/tecmis";
    private static final String _DRIVER_="com.mysql.jdbc.Driver";
    
    //Create connection
    public void _connection(){
        synchronized(_CONURL_){
            try {
                Class.forName(_DRIVER_);
                setCon(DriverManager.getConnection(_CONURL_,"root",""));
                
            } catch (Exception e) {
                
            }
        }
    }
    
    public static Connection connect(){
    
        Connection conn = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tecmis","root","");
            
            if(conn!=null)
            {
               System.out.print("Connected");
            }    
        
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    
        return conn;
    }
    
}
