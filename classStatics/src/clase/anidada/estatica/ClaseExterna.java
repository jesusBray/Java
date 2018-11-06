
package clase.anidada.estatica;


public class ClaseExterna {
    
    public class ClaseInterna {
        
        private void metodoInterno() {
            System.out.println("hola desde una: clase anidada interna!");
        }
        /////////////
    }
    
    private void metodoExterno1() {
        System.out.println("hola desde una: clase externa <metodo no estatico>!");
    }
    
    private static void metodoEstaticoExterno() {
        System.out.println("hola desde una: clase externa<metodo estatico>!");
    }
    
    static class ClaseEstatica{
        
        private void metodoInterno(){
            System.out.println("hola desde una metodo, clase estatica");
        }
        
        final protected  static void metodoInternoEstatico(){
            System.out.println("hola desde una metodo estatico, clase estatica");
        }
        protected  final static void metodoInternoEstatico2(){
            System.out.println("hola desde una metodo estatico, clase estatica");
        }
        protected  static final void metodoInternoEstatico3(){
            System.out.println("hola desde una metodo estatico, clase estatica");
        }
        protected  static void metodoInternoEstatico4(){
            System.out.println("hola desde una metodo estatico, clase estatica");
        }
    }
    
    public void testImprecion(){
        ClaseInterna ci = new ClaseInterna();
        ci.metodoInterno();
    }
    
    
    public static void main(String[] args) {
        /*ClaseExterna ejecutar = new ClaseExterna();
        ejecutar.metodoExterno1();
        ClaseExterna.ClaseInterna ejecutable = new ClaseInterna();
        ejecutable.metodoInterno();*/
        
        ClaseExterna c = new ClaseExterna();
        new ClaseExterna().new ClaseInterna().metodoInterno();
        
    }
}
