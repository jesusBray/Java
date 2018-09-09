
package newjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewJDBCmain {

    private static String DBusuario = "root";
    private static String DBpass = "root";
    private static String DBurl = "jdbc:mysql://localhost:3306/users";
    private static Connection coneccion = null;
    
    static{
        try {
            coneccion = DriverManager.getConnection(DBurl,DBusuario,DBpass);
            
        } catch (Exception e) {
            System.out.println("error en: "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection(){
        return coneccion;
    }
    
    
    public static void main(String[] args) {
        Connection conection = NewJDBCmain.getConnection();
        System.out.println("estoy conectado");
        
        
    }
    
}
