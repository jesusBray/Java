
package app7.com.clases;

import java.sql.*;
import javax.annotation.Resource;
import javax.sql.DataSource;

public class GetLogin {
    @Resource(name="jdbc/coneccion")
    private DataSource conPool;

    public GetLogin(DataSource conPool) {
        this.conPool = conPool;
    }
    
    public boolean validacionUsuario(String user,String pass){
        try {
            final Connection con = conPool.getConnection();
            final PreparedStatement preparedStatement = con.prepareStatement("select * from ?");
            preparedStatement.setString(1, "login");
            final ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if(user.equals(resultSet.getString("user")) && pass.equals(resultSet.getString("pass"))){
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println("error en validacionUsuario: "+ex.getMessage());
            return false;
        }
        
    }
}
