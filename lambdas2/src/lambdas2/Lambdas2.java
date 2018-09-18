

package lambdas2;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdas2 {

    public static void metodoEstatico(){
        System.out.println("estamos ejecutando el metodo estatico! ");
        
    }
    
    public void operar(){
        
//-----------------------metodos estatico usando lambdas-----------------
        operacion1 op1 = () -> Lambdas2.metodoEstatico();
        op1.asignar();
        
//--------------------referenciar metodos estaticos--------------------        
        operacion1 op2 = Lambdas2::metodoEstatico;
        op2.asignar();

    }
    
    public void metodoInstancia() {
        String[] nombres = {"roberta", "jesus", "ricardo","zuriel"};
        Arrays.sort(nombres,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(nombres));
        
//-------------------lambdas ---------------
        Arrays.sort(nombres,(o1,o2)-> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(nombres));
    }
    
    
    public static void main(String[] args) {
        Lambdas2 lm = new Lambdas2();
        
        
    }
    
}
