
package modelador;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConeccionSql {
    public Connection conSql(String user, String pass){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/appWebDB?useUnicode=yes&characterEncoding=UTF-8&useSSL=false",user,pass);
        } catch (Exception e) {
            System.out.println("error en la coneccion!"+e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        ConeccionSql c = new ConeccionSql();
        c.conSql("root", "root");
    }
}
