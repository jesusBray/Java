package clases;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Validacion{
    
    Conector con;
    
    public Validacion(Conector con) {
        this.con=con;
    }

    public Validacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean login(String user,String pass) throws SQLException{
        PreparedStatement prep = con.getConnection().prepareStatement("select user, pass from login where user=?, pass=?");
        prep.setString(1, "user");
        prep.setString(2, "pass");
        ResultSet result = prep.executeQuery();
        if(user.equals(result.getString("user")) && pass.equals(result.getString("pass"))){
            System.out.println("bienvenido");
            return true;
        }
        else{
            System.out.println("error");
        }
        return false;
    }
    public static void main(String[] args) throws SQLException {
        Validacion v = new Validacion(new Conector("root", "root"));
        v.login("adm", "123");
    }
}
