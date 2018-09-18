package lambdas4;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdas4 {
    
    String[] nombres = {"zuriel","jesus","abiel","tifanio"};
    Double[] numeros = {9.0,5.0,1.0,4.0};
    
    public void metodo1(){
        
//---------------------metodo------------------------------        
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(nombres));
//--------------------lambdas------------------------------
        Arrays.sort(nombres, (a,b)-> a.compareTo(b));
        System.out.println(Arrays.toString(nombres));
        
//--------------------metodos referentes --------------------
        Arrays.sort(nombres, String::compareTo);
        System.out.println(Arrays.toString(nombres));
    }
    
    public void metodo2(){
        
//--------------------metodos anonimos--------------------        
        Arrays.sort(numeros, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(numeros));
        
//-------------------lambdas-------------------------------
        Arrays.sort(numeros, (a,b)-> a.compareTo(b));
        System.out.println(Arrays.toString(numeros));
        
//-------------------metodos referentes -------------------
        Arrays.sort(numeros,Double::compareTo);
        System.out.println(Arrays.toString(numeros));
    }
    
    public void metodoInstancia1(){
        
    }
    
    public static void main(String[] args) {
        Lambdas4 lm = new Lambdas4();
        lm.metodo2();
    }
    
}
