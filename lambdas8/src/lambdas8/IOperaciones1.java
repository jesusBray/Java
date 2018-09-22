/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas8;

public interface IOperaciones1 {
    
    default void anuncio1(){
        System.out.println("saludos desde la interfase(IOperaciones1) -anuncio1");
    }
    
    default void anuncio2(){
        System.out.println("saludos desde la interfase(IOperaciones1) -anuncio2");
    }
    
    default void anuncio3(){
        System.out.println("saludos desde la interfase(IOperaciones1) -anuncio3");
    }
}
