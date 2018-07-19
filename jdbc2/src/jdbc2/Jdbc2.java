
package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jesus
 */
public class Jdbc2 {

    public static void main(String[] args) {
       
        try {
            // 1 crear la conexion;
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO","root","root");
            Statement miSentencia =  myConnection.createStatement();
            String consulta1 = "insert into dato_empleado (id_usuario, cargo, nombre, apellido, sueldo) value ('a1', 'fotografo', 'jesus', 'paye', 2000)";
            // 2 preparar la consulta
            //PreparedStatement miSentencia = myConnection.prepareStatement("inser into (id_usuario, cargo, nombre, apellido, sueldo) value (a1, fotografo, jesus, paye, 2000)");
            System.out.println("");
            
            // 3 estables parametros de la consulta 
//            miSentencia.setString(1, "gerente");
//            miSentencia.setString(2, "romulo");
            //ResultSet resultado = miSentencia.executeQuery();
            miSentencia.executeUpdate(consulta1);
//            while (resultado.next()) {
//                System.out.println("Cargo: "+resultado.getString(1)+"\tNombre: "+resultado.getString(2)+"\tSueldo: "+resultado.getInt(3));
//            }
            System.out.println("Se a anicionado un usuario mas");
//            
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
}
