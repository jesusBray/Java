
package mapas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Listar {
    
    Empleado e;
    public void mapas(){
        try {
            Connection coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root","root");
            PreparedStatement preparedstatement = coneccion.prepareStatement("select * from usuario");
            ResultSet resultset = preparedstatement.executeQuery();
        }catch(SQLException s){
            
        }    
        
        
    }
    
    HashMap<Integer, Empleado> listMap;
    
    public HashMap<Integer,Empleado>listador(Empleado e){
        listMap.put(e.getId(), e);
        
        
        
        return null;
    }
    
    
    public HashMap<Integer, Empleado> listador(){
        Integer i = 0;
        listMap = new HashMap<>();
        try {
            
            Connection coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root","root");
            PreparedStatement preparedstatement = coneccion.prepareStatement("select ?, ?, ? from ?");
            preparedstatement.setString(1, "nombre");
            preparedstatement.setString(2, "apellido");
            preparedstatement.setString(3, "edad");
            preparedstatement.setString(4, "usuario");
            ResultSet resultset = preparedstatement.executeQuery();
            while (resultset.next()) {
                i++;
                listMap.put(e.getId(), new Empleado(resultset.getString("nombre"), resultset.getString("apellido"), resultset.getInt("edad")));
            }
            
            return listMap;
        }catch(SQLException s){
            System.out.println("error en lsitador: "+s.getMessage());
        }
        
        return null;
    }
    
       
}
