/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_y_iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class Listas_y_iterator {

    public static void main(String[] args) {
        
            
        
//        metho1(123);
//        
//        
//        HashSet<String> list = new HashSet<>();
//        list.add("jess");
//        list.add("roberth");
//        list.add("romulo");
//        list.add("robustiano");
            String name="what do you know about me";  
            System.out.println(name.contains("do you know"));  
            System.out.println(name.contains("about"));  
            System.out.println(name.contains("a"));  
            
//            callbac(asd asd)
//            metodo(callbac){
//                imprimir(callback(asd, asd));
//            }
            
            
            
            
        
    }
//        
//        Iterable<String> iterable = list;
//        //Iterator<String> iterator = iterable.iterator();
//         for (String d : iterable) {
//            System.out.println("Nombre: "+d);
//        }
//        //imprimir(list);
            
    }
    
    static <T> void imprimir(Iterable<T> it){
        for (T t : it) {
            System.out.println("Nombre: "+t);
        }
    }
    
    static void metho1(Object algo){
        if(algo instanceof String){
            String a = (String)algo;
            System.out.println(a);
        }
        else if(algo instanceof Persona){
            System.out.printf("Name: %s Apellido: %s",((Persona)algo).getNombre(),((Persona)algo).getApellido());
        }
    }
    
}
class Persona{
    private final String nombre;
    private final String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    
}
