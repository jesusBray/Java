import java.io.FileReader;
import java.io.BufferedReader;

public class Leer {
    
    final private static void FicheroTxt(String direccion){
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion)); 
            String temp = "";
            
            while((texto = bf.readLine()) != null){
                System.out.println(texto);
            }   
            bf.close();
        } catch (Exception e) {
            System.out.println("no se pudo establecer coneccion"+e.getMessage());
        }
    }
        public static void main(String arg[]) {
            Leer.FicheroTxt("/home/jesus/Desktop/texto.txt");
        
    }
}