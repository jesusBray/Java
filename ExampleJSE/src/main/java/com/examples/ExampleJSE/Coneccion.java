package com.examples.ExampleJSE;
import java.sql.Connection;
import java.sql.DriverManager;

public class Coneccion{

    Connection coneccion = null;
    String dataBase = "users",user="root",pass="root";

    public void setConeccion(String dataBase,String user,String pass) {
         try {
             coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dataBase,user,pass);
         } catch (Exception e) {
             System.out.println("error en la connection a la base de datos! "+e.getMessage());
         }       
    }

    public Connection getConnect() {
        try {
            return coneccion = DriverManager.getConnection("jdbc:myql://localhost:3306/"+dataBase,user,pass);
        }catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return coneccion;
    }


}