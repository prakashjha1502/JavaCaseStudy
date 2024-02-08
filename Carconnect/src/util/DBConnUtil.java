package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnUtil {
	
    public static Connection getConnection() 
    {
    	Connection con=null;
                try 
                {
                   Class.forName("com.mysql.cj.jdbc.Driver");
                
            
                   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/carconnect","root","Root");
            
            return con;
                
        } catch (Exception e) {
          
              System.out.println(e);
        }
                return con;
    }
}
