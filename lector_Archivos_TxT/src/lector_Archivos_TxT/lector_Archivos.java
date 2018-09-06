package lector_Archivos_TxT;

import java.io.*;

public class lector_Archivos {
    
    
    public final static void Lector(String ubicacion) {
        String archivo = "";
        try {
            BufferedReader leer = new BufferedReader(new FileReader(ubicacion));
            
            while ((archivo = leer.readLine())!= null) {
                System.out.println(archivo);
            }
            leer.close();
        } catch (Exception e) {
            System.out.println("Erron en: "+e.getMessage());
        }
        
    }
}
