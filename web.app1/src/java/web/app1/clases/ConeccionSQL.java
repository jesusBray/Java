
package web.app1.clases;

import javax.sql.DataSource;
import java.sql.*;

public class ConeccionSQL {
    
    private final DataSource conectado;
    
    public ConeccionSQL(DataSource conectado){
        this.conectado=conectado;
    }
    
    public boolean abriendoConeccion(String user,String pass){
        try {
            PreparedStatement prepared = conectado.getConnection().prepareStatement("select * from login");
            ResultSet result = prepared.executeQuery();
            while(result.next()){
                if(user.equals(result.getString("user"))&& pass.equals(result.getString("pass"))){
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            System.out.println("error en el metodo: abriendoConeccion.."+e.getMessage());
            return false;
        }
    }
    
}
