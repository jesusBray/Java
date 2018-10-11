package app4.clases;
    
import java.sql.Connection;
import java.sql.DriverManager;

public class ConeccionSql {
    
    Connection con;
    String path="jdbc:mysql://localhost:3306/appWebDB?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";
    String user = "root";
    String pass = "root";
    public ConeccionSql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //com.mysql.cj.jdbc.Driver
            con = DriverManager.getConnection(path,user,pass);
        } catch (Exception e) {
            System.out.println("error en startConnection: "+e.getMessage());
        }
    }
    
    
}
