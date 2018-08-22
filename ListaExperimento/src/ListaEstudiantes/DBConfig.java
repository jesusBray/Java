
package ListaEstudiantes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {
    
    Properties p;
    String nig = "hola";
    public String pl = "hola";
    
    public DBConfig(String filePath) {
        loadProperties(filePath);
    }
    
    public void loadProperties(String filePath) {    
        try{
            p = new Properties();
            p.load(new FileInputStream(filePath));
        }
        catch (Exception e) {
          System.out.println("error en: "+e.getMessage());
        }
    }
    
    public String getUser(){
        return p.getProperty("BDUsuario");
    }
    
    public String getPassword(){
        return p.getProperty("BDPassword");
    }
    
    public String getPort(){
        return p.getProperty("BDPort");
    }
    
    public String getServer(){
        return p.getProperty("BDServer");
    }
    
    public void metodo(){
        
    }
}
