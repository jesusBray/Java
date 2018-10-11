package webApplication.clase;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecction {

    public void connectionStar(String path,String user,String pass) {
        try {
          Conecction conect = (Conecction) DriverManager.getConnection(path,user,pass);
            System.out.println("coeccion estable");
        } catch (Exception ex) {
            System.out.println("error en :" + ex.getMessage());
        }

    }

    public static void main(String[] args) {
        Conecction a = new Conecction();
        a.connectionStar("jdbc:mysql://localhost:3306","root","root");
    }

}
