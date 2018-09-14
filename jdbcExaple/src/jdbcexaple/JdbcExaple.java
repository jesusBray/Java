
package jdbcexaple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcExaple {
  
    public boolean base1() {
        try {
            Connection coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root","root");
            PreparedStatement preparedstatement = coneccion.prepareStatement("select * from usuario");
            ResultSet resultset = preparedstatement.executeQuery();
            while (resultset.next()) {
                System.out.println(resultset.getInt("id_user")+" "+resultset.getString("nombre"));
            }
        return true;    
        } catch (Exception e) {
            return false;
        }
    }
    
    
   
    
    
    
    public void base2(String tabla) {
        Connection coneccion= null;
        PreparedStatement preparedstatement ;
        ResultSet resultset;
        try {
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root","root");
      
            preparedstatement = coneccion.prepareStatement("select * from "+tabla);
            resultset = preparedstatement.executeQuery();
            while (resultset.next()) {
                System.out.println(resultset.getInt("id_user")+" "+resultset.getString("nombre"));
            }
        
        } catch (Exception e) {
            try {
                coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root","root");
                preparedstatement = coneccion.prepareStatement("create table "+tabla+"(id_user int(255)not null primary key,nombre varchar(255), apellido varchar(255), edad int(255), telefono int(255))");
                //preparedstatement = coneccion.prepareStatement("select * from "+tabla);
                resultset = preparedstatement.executeQuery();
                while (resultset.next()) {
                    System.out.println(resultset.getInt("id_user")+" "+resultset.getString("nombre"));
                }
            } catch (SQLException ex) {
                System.out.println("fallo al intentar crear otra clase");
                Logger.getLogger(JdbcExaple.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static void main(String[] args) {
        JdbcExaple jd = new JdbcExaple();
        jd.base1();
    }
    
}
