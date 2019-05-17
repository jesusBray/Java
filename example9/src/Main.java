
import java.util.Collection;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        
    }
    
    static <T> void mostrar(Collection<T> col, Filtro<T> filtro) {
        //iterar(col, filtro, System.out::println);
        //iterar(col, filtro, e -> System.out.println(e));
    }
    //cohecion debe de ser fuerte (el uso de atributos en una clase)
    //acoplamiento debe de ser debil("uso"union de clases lo mas debil posible)
    static <T, U> void iterar(Collection<T> col, 
                           Filtro<T> filtro, 
                           Hacer<U> h)
    {
        col.forEach(elem -> {
            if (filtro.permitir(elem)) {
                h.hacer((U) elem);
            }
        });
    }
    public void method(){
        
    }
}interface Hacer<T>{
    public int hacer(T hacer);
    
}interface Filtro<T>{
    public boolean permitir(T a);
    
}class Cobersor implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    
}
