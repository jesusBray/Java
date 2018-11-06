package clase.anidada.sombrear;

public class ClaseSombrear {
    int num1=10,num2=20;
    
    
    public class ClaseInternaSombrear{
        int num1=100,num2=200;
        
        public void inprimirDatos(){
            System.out.println("el numero es: "+this.num1);
            System.out.println("el numero es: "+this.num2);
            System.out.println("el numero es: "+ClaseSombrear.this.num2);
            System.out.println("el numero es: "+ClaseSombrear.this.num2);
        }
    }
    
    public static class ClaseInternaStatica{
        int num1=001,num2=002;
        
        public void inprimirDatos(){
            System.out.println("el numero es: "+this.num1);
            System.out.println("el numero es: "+this.num2);
        }
    }
    
    public void testImprecion(){
        ClaseSombrear c=  new ClaseSombrear();
        ClaseInternaSombrear ss = c.new ClaseInternaSombrear();
        ss.inprimirDatos();
    }
    
    public void testImprecionStatica(){
        ClaseSombrear.ClaseInternaStatica aa = new ClaseInternaStatica();
        aa.inprimirDatos();
    }
    
    public static void main(String[] args) {
        ClaseSombrear cs = new ClaseSombrear();
        cs.testImprecion();
        cs.testImprecionStatica();
    }
}
