package lambdas3;

import java.util.Arrays;
import java.util.Comparator;


public class Lambdas3 {
    String[] cadenas={"zuriel","jesus","amber"};
    Integer[] numeros = {9,6,1};
    
    public void operacion1(){
        
//---------------------metodo anonimo----------------------------        
        Arrays.sort(cadenas, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        
        System.out.println(Arrays.toString(cadenas));
     
//-------------------lambdas--------------------------------------
        Arrays.sort(cadenas,(a,b)-> a.compareToIgnoreCase(b));
        System.out.println(Arrays.toString(cadenas));
        
//---------------------metodos referentes------------------------        
        Arrays.sort(cadenas, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(cadenas));

    }
    
    public void operacion2(){
        Arrays.sort(numeros , new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(numeros));

//----------------------lambdas---------------------------        
        Arrays.sort(numeros, (a, b)-> a.compareTo(b));
        System.out.println(Arrays.toString(numeros));

//----------------------metodos referentees--------------------        
        Arrays.sort(numeros, Integer::compareTo);
        System.out.println(Arrays.toString(numeros));
    }
    
    public void metodosEstaticos(){
        
    }
    
    public static void main(String[] args) {
        Lambdas3 lm = new Lambdas3();
        lm.operacion2();
        
    }
    
}
