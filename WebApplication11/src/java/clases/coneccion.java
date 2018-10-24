
package clases;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.Driver ;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class coneccion {
    
    public com.mysql.cj.jdbc.ConnectionImpl con;
    public coneccion(String user, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  (ConnectionImpl) DriverManager.getConnection("jdbc:mysql:loadbalance://localhost:3306/appWebDB?useUnicode=yes&characterEncoding=UTF-8&useSSL=false",user,pass);
            System.out.println("coneccion realizada!");
        } catch (Exception e) {
            System.out.println("Error al ingresar a la base de datos: "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new coneccion("root", "root");
    }
    
    public ArrayList<Usuario> listado(){
        ArrayList<Usuario>list;
        try {
            PreparedStatement statement = con.prepareStatement("select * from ?");
            statement.setString(1, "datosCliente");
            ResultSet result = statement.executeQuery();
            list = new ArrayList<>();
            while (result.next()) {                
                list.add(new Usuario(result.getInt("id"), result.getString("nombre"), result.getString("apellido"), result.getInt("edad")));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error en listado "+e.getMessage());
            return null;
        }
    }
}
