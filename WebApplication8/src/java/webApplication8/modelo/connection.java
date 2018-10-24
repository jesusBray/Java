
package webApplication8.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    public Connection startConection(String usuario,String pass){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/users?useUnicode=yes&characterEncoding=UTF-8&useSSL=false",usuario,pass);
        } catch (Exception e) {
            System.out.println( "error en la coneccion!"+e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        connection c= new connection();
        c.startConection("root", "root");
    }
}
