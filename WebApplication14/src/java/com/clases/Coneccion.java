package com.clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Coneccion {

    String path, user, pass;

    public Coneccion(String path, String user, String pass) {
        this.path = path;
        this.user = user;
        this.pass = pass;
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("error en la coneccion a la base de datos!! " + e.getMessage());
        }
    }

    public Connection startConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(path, user, pass);
            if(con!=null){
                System.out.println("coneccion estable con la base de datos!");
            }
            return con;
        } catch (Exception e) {
            System.out.println("error en starConnection " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String path = "jdbc:mysql://localhost:3306/users?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";
        String user = "root";
        String pass = "root";
        Coneccion c = new Coneccion(path, user, pass);
        c.startConnection();
    }
}
