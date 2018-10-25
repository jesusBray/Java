package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccion {
    String path,user,pass;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Error en la coneccion! "+e.getMessage());
        }
    }
    
    public coneccion(String path,String user,String pass){
        this.path=path;
        this.user=user;
        this.pass=pass;
    }
    
    public void startConnection(){
        try {
            Connection con = DriverManager.getConnection(path,user,pass);
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        String path = "jdbc:mysql://localhost:3306/users?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";
        String user = "root";
        String pass = "root";
        coneccion c = new coneccion(path, user, pass);
        c.startConnection();
    }
}
