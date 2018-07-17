package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo1", "root", "root");
            Statement stmt = conn.createStatement();
            //String consultSQL = "insert into usuarios (nombre, apellido, id) VALUE ('ricardo', 'tinta', 12)";
            String consultaSQL2 = "update usuarios set nombre = 'onorio' where id= 1";
            stmt.executeUpdate(consultaSQL2);
            
            System.out.println("datos introducidos corectamente!");
            
            //IMPRECION EN LA BD
            ResultSet result = stmt.executeQuery("select * from usuarios");
            while(result.next()){
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                String edad = result.getString("edad");
                String direcc = result.getString("direccion");
                System.out.println("nombre: " + nombre+"\t apellido: "+apellido+" \t edad: "+edad+"\t direcction: "+direcc);
            }
            
        }catch(Exception e){
            System.out.println("No es posible la coneccion");
            e.printStackTrace();
        }
    }   
}