
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;


public class MAin {

    public static void main(String[] args) {
        
//        method2(new callback() {
//            @Override
//            public int method1(Object a, Object b) {
//                return (int)a + (int)b;
//            }
//        });
        
//        method2(new callback() {
//            @Override
//            public int method1(Object a, Object b) {
//                return (int)a+(int)b;
//            }
//        });
        
        
    }
    public static int method2(Object callback){
        return (int)callback;
    }
    
    public static void method3(Object o){
        System.out.println(o);
    }
    
}class c implements Comparator<String>{

    
    public int compare(int o1, int o2) {
//        int result = o1.length() - o2.length();s
        return o1+o2;
    }
    
    //public abstract int method1(Object a, Object b);

    @Override
    public int compare(String o1, String o2) {
        int c = o1.length() - o2.length();
        if (c != 0) {
            return c;
        }
        
        return o1.compareTo(o2);
    }
    
}abstract class callback{
    public abstract int suma(int a,int b);
}interface functional{
    
}
