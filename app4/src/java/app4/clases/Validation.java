
package app4.clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Validation extends ConeccionSql{
    
    public boolean login(String user,String pass) throws SQLException{        
            PreparedStatement prep = con.prepareStatement("select * from login");
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                if(user.equals(result.getString("user")) && pass.equals(result.getString("pass")))
                    return true;
            }
        return false;
    }
  
}
