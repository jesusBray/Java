
package Leer_Archivo_properties;

import java.util.ResourceBundle;

public class main {
    public static final String APP_DESCRIPTION = "app.description";
    public static final String APP_VERSION = "app.version";
    public static final String APP_PATH = "app.path";
    public static final String APP_NAME = "app.name";

    private static ResourceBundle rsr;

    static {
        try
        {
           rsr = ResourceBundle.getBundle("util.initconfig");
        }
        catch (Throwable e) {}
    }
    
    public static String getAbsoluteResourceName(String resourceName) {
        return rsr.getString("app.path") + System.getProperty("file.separator") + resourceName;
    }
    
    
    
    public void Lectura_Properties(){
        
    }
    
    public static void main(String[] args) {
        
    }
}
