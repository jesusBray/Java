package Biblioteca;
public class Main{
    public static void main(String[] arg){

        Libro libro1 = new Libro("El libro del ayer",100,2.0);
        Libro libro2 = new Libro("Cocacole",123,2.2);
        Libro libro3 = new Libro("The door",123,4.0);
        Libro libro4 = new Libro("My memory",123,54.0);

        Bodega bodega = new Bodega();
        bodega.getAgregar(libro1);
        bodega.getAgregar(libro2);
        bodega.getAgregar(libro3);
        bodega.getAgregar(libro4);
       
        for(int i=0; i<4; i++){
            System.out.println(bodega.Index(i).getNombre());
        }
    }
}