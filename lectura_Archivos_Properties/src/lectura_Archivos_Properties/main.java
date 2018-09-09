package lectura_Archivos_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class main {
    
    public void metodo() throws IOException{
         Properties p = new Properties();
        try (InputStream ins = getClass().getResourceAsStream("/dentro/del/zip.properties")) {
            p.load(ins);
        }
        File f = new File("ruta/al/externo.properties");
        if (f.exists() && f.canRead()) {
            try(FileInputStream ins = new FileInputStream(f)) {
                p.load(ins);
            }
        }
    }
    public static void main(String[] args) {
           
    }
   
}
