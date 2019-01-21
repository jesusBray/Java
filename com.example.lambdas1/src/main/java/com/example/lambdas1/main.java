
package com.example.lambdas1;

import java.util.function.*;
import java.util.Scanner;
public class main implements NewInterfaceFunctional2<Integer>{
 
    public void operacionAritmeticaLambda(Integer a1, Integer b2){
        NewInterfaceFunctional2<Integer> calcular = (a,b)-> a+b; 
        System.out.println("Resultado: "+calcular.suma(a1, b2));
    }
    
    public void operacionAritmeticaClaseAnonima(int a ,int b){
        NewInterfaceFunctional2<Integer> opecarion = (Integer t, Integer k) -> t+k;
        System.out.println("Resultado: "+opecarion.suma(a, b));
    }
    
    
    
    @Override
    public int suma(Integer t, Integer k) {
        return t+k;
    }
    
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        
//        NewInterfaceFunctional<String> pred = a -> a.startsWith("M");
//        System.out.println(pred.predicate("Moberto"));

        System.out.print("Digite un numero! ");
        Integer dato1 = entradaDatos.nextInt();
        System.out.print("Digite un segundo numero! ");
        Integer dato2 = entradaDatos.nextInt();
        new main().operacionAritmeticaLambda(dato1, dato2);

    
    }

}
