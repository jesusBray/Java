
package ejercicio1;

public class main {
    public  String mensaje_de_clase = "mensaje: ";
    //metodo
    public String metodo(String mensaje){
        return this.mensaje_de_clase + mensaje;
    }
    
    //procedimiento
    public void procedimiento(String mensaje){
        if (!mensaje.equals("")) {
            System.out.println(mensaje_de_clase + mensaje);return;
        }
        
        System.out.println("no hay mensaje");
    }
    
    //funcion
    public final static String funcion(String mensaje) {
        return "mensaje: "+mensaje;
    }
    
    //metodo main ejecutor de metodos
    public static void main(String[] args) {
        main m = new main();
        System.out.println(m.metodo("como estan"));
        m.procedimiento("hola como estan");
        System.out.println(main.funcion("como estan"));
        
    }
    
}
