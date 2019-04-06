
class ListaEnlazadaNodo<T> {

    private final T valor;
    private ListaEnlazadaNodo<T> siguiente;
   public ListaEnlazadaNodo(
                T valor,
                ListaEnlazadaNodo<T> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
 
    public T getValor() {
        System.out.println(valor);
        return valor;
    }
    
    public ListaEnlazadaNodo<T> getSiguienteNodo() {
        return siguiente;
    }
    
    public void setSiguienteNodo(ListaEnlazadaNodo n) {
        siguiente = n;
    }
}
