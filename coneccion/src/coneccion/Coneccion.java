/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;
import java.sql.Connection;
import java.sql.DriverManager;
public class Coneccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
            System.out.println("conectado  ala base de datos!");
        } catch (Exception e) {
            System.out.println("no estas conectado a la base de datos!"+e.getMessage());
        }
    }
    
}
