
package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author jesusbook
 */
public class Reflection {

    public static void main(String[] args) {
        
//        Class<?> cc = String.class;
//        
//        for (Method m : cc.getMethods()) {
//            System.out.println(
//                    m.getReturnType().getSimpleName() + " " + m.getName());
//        }
        
        String cod = "soy Jesus";
        try {
            Class clazz = cod.getClass();
            Method m = clazz.getMethod("length");
            Constructor c = clazz.getConstructor();
            Object o = c.getName();
            System.out.println(c);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            
            Class classPunto =  Class.forName("reflection.Persona");
            Constructor con = classPunto.getConstructor(String.class);
            Object obj = con.newInstance("jesus");
            System.out.println(obj);
            
            
            
            
        } catch (Exception e) {
        }
        
        
    }
    
}
