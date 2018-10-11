
package webApplication.clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    public void startConnection(String path, String user, String pass){
        int time=0;
        try {
            Connection con = DriverManager.getConnection(user, user, pass);
            System.out.println("conectado a la base de datos! ");
        } catch (Exception e) {
            System.out.println("error en la coneccion a la base de datos!"+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        connection c = new connection();
        c.startConnection("jdbc:mysql://localhost:3306", "root", "root");
    }
}
