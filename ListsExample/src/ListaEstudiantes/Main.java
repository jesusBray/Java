package ListaEstudiantes;

import java.sql.*;

/**
 *
 * @author jesus
 */
public class Main {
    public static void main(String[] args) {
//       Menu m = new Menu();
//       m.Sart();
        //new Menu().Start();
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo1", "root", "root");
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from usuarios");
            
            while(result.next()){
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                String edad = result.getString("edad");
                String direcc = result.getString("direccion");
                System.out.println("nombre: " + nombre+"\t apellido: "+apellido+" \t edad: "+edad+"\t direcction: "+direcc);
            }
            
        }catch(Exception e){
            System.out.println("error en la base de datos: " + e.getMessage());
            e.getStackTrace();
        }finally{
            System.out.println("final");
        }
        
    }
}
