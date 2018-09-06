
package escribir_Archivos_TxT;

import java.io.*;

public class Escribir_Archivo_TxT {
    
    public final static void LeerArchivo(String ruta_del_archivo,String documentacion) {
        try {
            FileWriter archivo = new FileWriter(new File(ruta_del_archivo),true);
            archivo.write(documentacion);
        } catch (Exception e) {
            System.out.println("error en: "+e.getMessage());
        }
        
        
        
    }
    
}
