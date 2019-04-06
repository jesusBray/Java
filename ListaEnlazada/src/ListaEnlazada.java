
class ListaEnlazada<T> {
    private ListaEnlazadaNodo<T> primerNodo;
    private ListaEnlazadaNodo<T> ultimoNodo;
    
    public ListaEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }
    
    public ListaEnlazadaNodo<T> getPrimerNodo() {
        return primerNodo;
    }
    
    public void agregar(T obj) {
        ListaEnlazadaNodo<T> nuevo =
                new ListaEnlazadaNodo<T>(obj, null);
        
        if (primerNodo == null) {
            System.out.println("1 primerNodo "+primerNodo+", ultimoNodo "+ultimoNodo+", nuevo "+nuevo);
            primerNodo = ultimoNodo = nuevo;
            System.out.println("2 primerNodo "+primerNodo+", ultimoNodo "+ultimoNodo+", nuevo "+nuevo);
        }
        else {
            ultimoNodo.setSiguienteNodo(nuevo);
            System.out.println("3 ultimoNodo "+ultimoNodo+", nuevo "+nuevo);
            ultimoNodo = nuevo;
            System.out.println("4 ultimoNodo "+ultimoNodo+", nuevo "+nuevo);
        }
    }
    
    
}
