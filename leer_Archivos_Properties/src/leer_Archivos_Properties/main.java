
package leer_Archivos_Properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



public final class main {
    Properties p = new Properties();
    
    public main(String path){
        doit(path);
    }
    
    public void doit(String path) {
        try{
            p.load(new FileInputStream(path));
        }
        //"/home/jesus/Desktop/Props.properties"
        catch (Exception e) {
          System.out.println(e);
        }
    }
    public String getUsuario(){
        return p.getProperty("BDUsuario");
    }
    
    
    public String getPassword(){
        return p.getProperty("BDPassword");
    }
    
    public static void main(String[] args) {
        main p = new main("/home/jesus/Desktop/Props.properties");
        try {
            //jdbc:mysql://localhost:3306/USUARIO"
            Connection conn = DriverManager.getConnection("jdbc/mysql://localhost:3306/users","root","root");
            System.out.println("conectado");
            
        } catch (Exception e) {
            System.out.println("error al intentar conectarse");
        }
        
        
        
    }
}
