package ListaEstudiantes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Manejo_Archivos {
    
    private String ruta_archivo = null;
    private String escribir_datos = null;
   
    public Manejo_Archivos(String ruta_archivo) {
        this.ruta_archivo = ruta_archivo;
    }
    
    public Manejo_Archivos(String ruta_archivo, String escribir_datos) {
        this.ruta_archivo = ruta_archivo;
        this.escribir_datos = escribir_datos;
    }
    
    public String Leer_Archivo(){
        String resultado = "";
        try {
            
            File archivo = new File(ruta_archivo);
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("El archibo era inexistente \nSe a creado un archivo nuevo con el mismo nombre: "+archivo.getName());
            }
            BufferedReader bf = new BufferedReader(new FileReader(archivo));     
            resultado = bf.readLine();
        } catch (Exception e) {
            System.out.println("Error en: "+e.getMessage());
        }
        return resultado;
    }
    
    public void Escribir_Archivo(){
        try {
            File archivo = new File(ruta_archivo);
            
           
            FileWriter escribir=new FileWriter(archivo);
            escribir.write(escribir_datos);
            System.out.println("archivo guardado corectamente"); 
            
            if (archivo.exists()) {             
                archivo.createNewFile();
                System.out.println("El archibo era inexistente \nSe a creado un archivo nuevo con el mismo nombre: "+archivo.getName());
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println("error en: "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Manejo_Archivos ma = new Manejo_Archivos("/home/jesus/Desktop/texto.txt");
        System.out.println(ma.Leer_Archivo());
   
    }
}
