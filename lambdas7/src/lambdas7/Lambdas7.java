
package lambdas7;

import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Lambdas7 implements iOperacion1,iOperacion2{
    String[] nombres={"zuriel","jesus","abiel","ramona"};
    private static Connection con;
    
    @Override
    public void metodoDefault( ) {
        iOperacion1.super.metodoDefault();
        iOperacion1.super.metodoDefault2();
        iOperacion2.super.metodoDefault();
        iOperacion2.super.metodoDefault(con);
        metodoDefault4();
    }
    
    public static void metodoEstatico(){
        System.out.println("hola desde un metodo estatico! ");
    }
    
    public void metodoCorriente(){
        Arrays.sort(nombres, (a,b)-> a.compareTo(b));
        System.out.println(Arrays.toString(nombres));

    }
    
    @Override
    public void metodoDefault3(){
        iOperacion3 op3= () -> {
            Lambdas7.metodoEstatico();
        };
        op3.metodoFunctionalInterface();
    }
    
    public static void main(String[] args) {
        Lambdas7 lm = new Lambdas7();
        System.out.println(Arrays.toString(lm.nombres));
        System.out.println("Despues! \n");
        lm.metodoCorriente();
    }
}
  