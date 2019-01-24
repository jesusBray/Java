
public class main{
        
    
    public void imprimir(double a2,double b2){
        
        interfaceLamb1<Double> op;
        op = (a, b) -> a+b;
        
        System.out.println(op.suma(a2, b2));
    }
        
    public static void main(String[] args) {
        main m = new main();
        m.imprimir(1, 20);
          
    }

    
    
}
