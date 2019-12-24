package database_console;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnect {

  
    public static void main(String[] args) {
        try{
        String host = "jdbc:derby://localhost:1527/ofy";
        String uName = "ofy";
        String uPass= "123456";
        Connection con = DriverManager.getConnection( host, uName, uPass );
        
        Statement stmt = con.createStatement();
        String SQL = "SELECT * FROM CALISAN";
        ResultSet rs = stmt.executeQuery( SQL );
        
        while(rs.next( )){
        int id = rs.getInt("Id");
        String name = rs.getString("Isim");
        String lastname = rs.getString("Soyisim");
        int age = rs.getInt("Yas");
        String unvan = rs.getString("Unvan");
        
        System.out.println( id + " " + name + " " + lastname + " " + age +" " + unvan);
        }
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        }
        
        


    }
    

