
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
    
    public void metodoCorriente(){
//-----------------metodo anonimo-------------------------------
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
//-----------------------expreion lambdas----------------------        
        Arrays.sort(nombres, (a,b)-> a.compareToIgnoreCase(b));
        System.out.println(Arrays.toString(nombres));
//        ----------------referencia de metodos------------------
        Arrays.sort(nombres,String::compareTo);
        System.out.println(Arrays.toString(nombres));
        
    }
    
    public static void metodoEstatico(){
        System.out.println("hola desde un metodo estatico! ");
    }
    
    @Override
    public void metodoDefault3(){
        iOperacion5 op5 = (nota) -> {
            Lambdas7.metodoEstatico();
            return nota+"......";
        };
        System.out.println(op5.metodoFunctionalInterface("esta es una nota aderida al metodo metodoDefault3"));
    }
    
    public void metodoCorriente1(){
        System.out.println("hola todos desde el metodoCorriente 1!!!");

    }
    
    public void metodoConstructor(){
        
        iOperacion3 op5 = (int id, String nombre, String gerarq) -> new Persona(id, nombre, gerarq);
        Persona per = op5.crearPersona(1, "jesus", "vice precidente junior");
        System.out.println(per.toString());
        
//----------------------------tambien referencia de metodos*-----------------------

        iOperacion3 op3 = Persona::new;
        Persona per2 = op3.crearPersona(2, "brayan", "precidente junior");
        System.out.println(per2.toString());
    }
    
    public static void main(String[] args) {
        Lambdas7 lm = new Lambdas7();
        lm.metodoConstructor();
    }
}
  