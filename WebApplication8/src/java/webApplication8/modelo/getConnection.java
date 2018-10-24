
package webApplication8.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class getConnection {
    
    public ArrayList<empleado> getConn(){
        ArrayList<empleado> lista = new ArrayList<>();
        empleado e;
        String queries = "select * from empleado";
        try {
            PreparedStatement preparedStatement = null;
            System.out.println("akiii");
            ResultSet result = preparedStatement.executeQuery();
            System.out.println("akiii2");
            while (result.next()) {                
                lista.add(new empleado(result.getInt("id"), result.getString("nombre"), result.getInt("salario")));
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("error en la salida de datos!"+ex.getMessage());
            return null;
        }
    }
}
