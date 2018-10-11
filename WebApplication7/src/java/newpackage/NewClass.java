package newpackage;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class NewClass {
    
    public void connection(){
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root","root");
            System.out.println( "Coneccion estable con la base de datos!");
        } catch (Exception e) {
            System.out.println( "error en la coneccion a la base de datos: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.connection();
    }
}
