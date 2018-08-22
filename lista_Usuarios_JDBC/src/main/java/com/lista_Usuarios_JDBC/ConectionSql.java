package com.lista_Usuarios_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionSql {
    private String path,user,password;
    private Connection myConnection = null;
    
    public ConectionSql(String path, String user,String password) {
        this.path = path;
        this.user=user;
        this.password = password;
    }
    
    public Connection Connect() {
        try {
            System.out.println("coneccion establesida ");
            return myConnection = DriverManager.getConnection(this.path,this.user,this.password);
        }catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return myConnection;
    }
    public void ExitConnection() {
        try {
            myConnection.close();
        } catch (Exception e) {
            System.out.print("erroe en el cierre de conexion"+e.getMessage());
        }
    }
}