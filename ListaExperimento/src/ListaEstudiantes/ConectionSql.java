
package ListaEstudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectionSql {
    String cargo="Cargo: ",nombre=" Nombre: ",apellido=" Apellido: ",sueldo=" Sueldo: ";
    
    public void Campo1 (String dato1) {
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO","root","root");
            // 2 preparar la consulta
            PreparedStatement miSentencia = myConnection.prepareStatement("SELECT cargo, nombre, apellido, sueldo FROM dato_empleado WHERE nombre=?");
            // 3 estables parametros de la consulta 
            miSentencia.setString(1, dato1);
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
