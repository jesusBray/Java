package Biblioteca;
import java.util.ArrayList;
public class Bodega{

    ArrayList<Libro> lista;

    public Bodega(){
        lista = new ArrayList<>();
    }

    public void getAgregar(Libro libros){
        lista.add(libros);
    }

    public Libro Index(int i){
        return lista.get(i);
    }

    
}