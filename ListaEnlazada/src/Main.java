
public class Main {

    public static void main(String[] args) {
        
        
        ListaEnlazada<Object> le = new ListaEnlazada<>();
//        le.agregar("hola");
//        le.agregar("amigos");
//        //le.agregar(new Punto(10, 20));
//        le.agregar("Java");
//        // DESDE JAVA 5: Autoboxing
//        le.agregar(164);
        le.agregar(true);
        le.agregar(45935498534L);
//        le.agregar(Math.PI);
//        le.agregar('k');
        
        ListaEnlazadaNodo<Object> nodo = le.getPrimerNodo();
        
        while (nodo != null) {
            System.out.println(nodo.getValor());
            nodo = nodo.getSiguienteNodo();
        }
        
    }    
}
