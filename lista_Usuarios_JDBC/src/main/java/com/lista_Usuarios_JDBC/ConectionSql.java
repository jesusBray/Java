package com.lista_Usuarios_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionSql {
    private String user,password;
    private Connection myConnection = null;
    
    public ConectionSql(String user,String password) {
        this.user=user;
        this.password = password;
    }
    
    public boolean isConnected() {
        try{
            System.out.println("verifcando datos ");
            if (Connect().isClosed()) {
                System.out.println("La base de datos esta apagada");
                return false;
            }
        }catch (Exception e) {
            System.out.println("No se pudo estableder coneccion " + e.getMessage());
            e.getStackTrace();
        }
        return true;
    }
    
    public Connection Connect() {
        try {
            System.out.println("coneccion establesida ");
            return myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO",this.user,this.password);
        }catch (Exception e) {
            System.out.println("Error no coneccion no establecida");
        }
        return myConnection;
    }


    
}