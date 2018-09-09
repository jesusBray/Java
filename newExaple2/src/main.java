
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {

    public main(Connection conn){
        try {
            conn = DriverManager.getConnection("jdbc/mysql://localhost:3306/empleado","root","root");
        } catch (Exception e) {
            System.out.println(" error en la ejecucion de el etodo connection"+e.getMessage());
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        try {
            Connection s = null;
            PreparedStatement prep = null;
            main a = new main(s);
            prep = s.prepareStatement("select * from datos_personales");
            if (prep.executeUpdate()) {
                
            }
        } catch (SQLException ex) {
            System.out.println("error en la obtencion de datos a la base de datos");
        }
        
        
    }
    
}
