package lambdas6;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdas6 {
    
    public static void operacionesStaticas(){
        System.out.println("hola a todos");
    }
    
    public void getResultado(){
        ioperacion1 op = (a,b) -> { return a+b;
        };
        System.out.println(op.ioperacion1(10, 20));
//---------metodos referenciales-------------
        ioperaciones3 op3 = Lambdas6::operacionesStaticas;
        op3.operar();
    }
    
    public void getMetodoarbitrario(){
        String[] nombres= {"jesus","abiel","ramona","zuriel"};
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });System.out.println(Arrays.toString(nombres));
    }
            
    public static void main(String[] args) {
        Lambdas6 lm = new Lambdas6();
        lm.getMetodoarbitrario();
        
        
    }
    
}
