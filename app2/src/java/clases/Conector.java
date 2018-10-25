
package clases;
    import java.sql.Connection;
    import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    String path = "jdbc:mysql://localhost:3306/users?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";
    String user,pass;  
    public Connection con=null;
    
    public Conector(String user,String pass) {
        this.user=user;
        this.pass=pass;
    }
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(path,user,pass);
            if(con==null)
                System.out.println("error! datos nulos ");
            System.out.println("Conectado a la base de datos!");
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error en la coneccion a la base de datos! "+e.getMessage());
            return con;
        }
    }
    
    
}
