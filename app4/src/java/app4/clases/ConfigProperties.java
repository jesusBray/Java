package app4.clases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
    
    private Properties prop;

    public ConfigProperties(String path) {
        path(path);
    }
    
    private void path(String path){
        prop = new Properties();
        try {
            prop.load(new FileInputStream(path));
        } catch (IOException e) {
            System.out.println("error en path: "+e.getMessage());
        }
    }
    
    public String getDatosDB(String nameDB){
        return prop.getProperty(nameDB);
    }
    
}
