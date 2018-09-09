package PrincipalPaquete;

import java.sql.*;

public class main {
   
    public static void main(String[] args) {
        try {
            final Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root");
            final PreparedStatement prepared = conn.prepareStatement("select * from producto");
            ResultSet resut = prepared.executeQuery();
            
            while (resut.next()) {
                System.out.println(resut.getInt("in_producto"));
                System.out.println(resut.getString("nombre_producto"));
            }
            
        } catch (Exception e) {
        }
        
        
    }
    
}
