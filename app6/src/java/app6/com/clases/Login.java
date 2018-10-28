
package app6.com.clases;

import java.sql.*;
import javax.sql.DataSource;

public class Login {
    
    private DataSource conPool;
    public Login(DataSource conPool){
        this.conPool=conPool;
    }
    
    public boolean getLogin(String user,String pass){
        try {
            Connection con = conPool.getConnection();
            PreparedStatement prepared = con.prepareStatement("select * from ?");
            prepared.setString(1, "login");
            ResultSet result = prepared.executeQuery();
            while (result.next()) {                
                if(user.equals(result.getString("user")) && pass.equals(result.getString("pass"))){
                    return true;
                }
            }
            System.out.println("dato invalido!");
            return false;
        } catch (SQLException e) {
            System.out.println("error en getLogin: "+e.getMessage());
            return false;
        }
    }
}
