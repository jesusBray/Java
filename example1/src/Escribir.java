
/*Clase que permite escribir en un archivo de texto*/

//Impor
import java.io.File;
import java.io.FileWriter;

public class Escribir {
    public static void main(String []args) {

        //Un texto cualquiera guardado en una variable
        String saludo="Hola como estamos en este da tan lluvioso";
        try
        {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo=new File("texto1.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir=new FileWriter(archivo,true);

            //Escribimos en el archivo con el metodo write
            escribir.write(saludo);
            
            //verificaion del texto guardado exitosamente
            System.out.println("archivo guardado corectamente");
            
            //Cerramos la conexion
            escribir.close();
        }
        //Si existe un problema al escribir cae aqui
        catch(Exception e)
        {
            System.out.println("Error al escribir "+e.getMessage());
        }
    }
} 