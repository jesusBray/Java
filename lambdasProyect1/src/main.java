
import java.util.Arrays;
import java.util.Comparator;

public class main {

    public double calculadora(double num1,double num2){
        operaciones1F op1 = (a, b) -> {
          return (a + b) /2;
        };
        return op1.calcular(num1, num2);
    }
    
    public static void metodoEstatico() {
        System.out.println("metodo estatico ejecutandose");
    }
    
    public void metodoArbitrario() {
        String[] nombres = {"jesus", "anacleto", "zamudio","robertha"};
                
//-------------------------metodo anonimo----------------------//
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(nombres));
        
        
//-------------------------lambdas-----------------------------//        
        Arrays.sort(nombres,(a,b)-> a.compareToIgnoreCase(b));
        System.out.println(Arrays.toString(nombres));
        
        
//-------------------------referencia a metodos----------------//  
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
        
    }
    
    public void referenciarInterfaceFuncional(){
        System.out.println("hola desde: referenciarMetodoDeInstancia");
    }
    
    public void referenciarConstructor(){
        
//----------------------metodo anonimo-----------------------        
        operacion3F op3 = new operacion3F() {
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        op3.crear(22, "jesus");
        
//---------------------lambdas------------------------------
        operacion3F opi3 = (a,b)-> ( new Persona(a, b));
        Persona p = opi3.crear(22, "jesus");
        System.out.println("El id: "+p.getId()+"Nombre: "+p.getNombre());
                
//-----------------------metodos a referencia-----------------------
        operacion3F opif3 = Persona::new;
        Persona per = opif3.crear(1, "jesus");
        System.out.println("ID: "+p.getId()+"Nombre: "+p.getNombre());
        
    }
    
    public void operarMetodos(){
        operacion2F op2 = main::metodoEstatico;
        op2.saludar();
    }
    
    public static void main(String[] args) {
        main m = new main();
        m.referenciarConstructor();
    }
    
}
