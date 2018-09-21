
package lambdas7;

import java.sql.Connection;

public interface iOperacion2 {
    
    default void metodoDefault(Connection con){
        String nota = "hola ";
        System.out.println("operacion desde la interface"+nota);
    }
    
    default void metodoDefault(){
        String nota = "hola ";
        System.out.println("operacion desde la interface"+nota);
    }
}
