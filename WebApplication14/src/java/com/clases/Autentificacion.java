
package com.clases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Autentificacion extends Coneccion{
    
    public Autentificacion(String path ,String user,String pass) {
       super(path, user, pass);
       
    }
    
//    protected PreparedStatement consulta (String queres) {
//        try {
//            return statrConnection().prepareStatement(queres);
//        } catch (SQLException e) {
//            System.out.println("error en consulta "+e.getMessage());
//            return null;
//        }
//    }
    
    protected ResultSet ejecutarConsulta (PreparedStatement ps) {
        try {
            return ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("error en ejecutarConsulta!: "+e.getMessage());
            return null;
        }
    }
    

    
    
}
