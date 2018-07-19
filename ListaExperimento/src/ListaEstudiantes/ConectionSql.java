
package ListaEstudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectionSql {
    String cargo="Cargo: ",nombre=" Nombre: ",apellido=" Apellido: ",sueldo=" Sueldo: ";
    
    public void Campo1 (String id_usuario, String cargo, String nombre, String apellido, int sueldo) {
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO","root","root");
            // 2 preparar la consulta
            //ResultSet result = stmt.executeQuery("select * from usuarios");
            //PreparedStatement miSentencia = myConnection.prepareStatement("SELECT cargo, nombre, apellido, sueldo FROM dato_empleado WHERE nombre=?");
            PreparedStatement miSentencia = myConnection.prepareStatement("insert into dato_empleado (2, cargo, nombre, apellido, sueldo) value (id_usuario=?, cargo=?, nombre=?, apellido=?, sueldo=?)");
            // 3 estables parametros de la consulta 
            miSentencia.setString(1, id_usuario);
            miSentencia.setString(2, cargo);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, apellido);
            miSentencia.setInt(5, sueldo);
            ResultSet resultado = miSentencia.executeQuery();
            while (resultado.next()) {
                System.out.println(cargo+resultado.getString(1)+nombre+resultado.getString(2)+apellido+resultado.getString(3)+sueldo+resultado.getInt(4));
            }
            resultado.close();
            
        } catch (Exception e) {
            System.out.println("No se pudo estableder coneccion "+e.getMessage());
            e.getStackTrace();
        }
    }
}
