
package lambdas7;

public interface iOperacion1 {
    
    final static String n="";
    
    default void metodoDefault(){
        System.out.println("operacion desde la interface");
    }
    
    default void metodoDefault2(){
        System.out.println("operacion desde la interface usando otro metodo por default");
    }
    
    default void metodoDefault3(){
        System.out.println("operacion desde la interface");
    }
    
    default void metodoDefault4(){
        String nota = "hola ";
        System.out.println("operacion desde la interface"+nota);
    }
}
