
package app8.com.clases;
import java.sql.*;
import javax.sql.DataSource;

public class GetLogin {
    
    private final DataSource conPool;

    public GetLogin(DataSource conPool) {
        this.conPool = conPool;
    }
    
    public boolean logear(String user,String pass){
        try {
            Connection con = conPool.getConnection();
            Statement stat = con.createStatement();
            ResultSet result = stat.executeQuery("select * from login");
            while (result.next()) {                
                if (user.equals(result.getString("user"))&& pass.equals(result.getString("pass"))) {
                    return true;
                }
            }
            return false;
        } catch (SQLException | NullPointerException e) {
            System.out.println("error en logear: "+e.getMessage());
            return false;
        }
    }
}
