
package Exaple2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Exaple2 {
    Connection connection = null;
    
    
    public void conectarse() throws SQLException{
        connection = (Connection)DriverManager.getConnection("jdbc/mysql://localhost:3306/usuars","root","root");
        //si queremos hacer transsacciones con las bases de datos tenemos que usar inoDbo mahysan
        //tambien ejecutar el metodo setAutoCommit(false); false para decirle que estos metodos esta bajo ese resguardo el cual es 
        connection.setAutoCommit(false);
    }
    
    
    public static void main(String[] args) {
        
        
        try {
            conection = DriverManager.getConnection("","","");
            System.out.println("Digite algo");
            dato = entrada.nextLine();
        
        } catch (Exception e) {
        
        }finally{
            if (dato!= null) {
            System.out.println("hola esta ejecutandose el null");
            }
        }
        
    }
}
