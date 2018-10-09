
package com.clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conector {
    private String path, user, pass;
    protected Connection con;
    
    public conector(String path,String user,String pass){
        this.path=path;
        this.user=user;
        this.pass=pass;
    }
    
    
    public Connection getConeccion(){
        try {
            con = DriverManager.getConnection(path, user, pass);
            if(con == null)
                System.out.println("coneccion erroenea!!");
            System.out.println("coneccion exitosa");
            return con;
        } catch ( SQLException e) {
            System.out.println("error en la coneccion a la base de datos! "+e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        
        String path = "jdbc:mysql://localhost:3306/users?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";
        String user = "root";
        String pass = "root";conector c = new conector(path, user, pass);
        c.getConeccion();
    }
}
