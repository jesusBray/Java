
package com.webApplication.clas;
import java.sql.*;
public class ConeccionSQL {
    
    
    public ConeccionSQL(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }
    }
}
