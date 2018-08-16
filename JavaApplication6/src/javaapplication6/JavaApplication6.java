

package javaapplication6;

import java.util.ArrayList;
import java.util.LinkedList;


public class JavaApplication6 {

    
    public static void main(String[] args) {
        Persona<String> nombre = new Persona<>();
        nombre.set("juan");
        
        
        
        int numero = 5;
        
        System.out.println(numero > 10 ? "El número es mayor a 10."
        : "El número es menor o igual a 10.");
        System.out.println(nombre.get());
    }
    
}
