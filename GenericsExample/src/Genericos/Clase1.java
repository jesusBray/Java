package Genericos;

public class Clase1<T> {
    private T letra;

    public Clase1() {
        letra = null;
    }

    public T get() {
        return letra;
    }

    public void set(T letra) {
        this.letra = letra;
    }

    public static <T>  String Palabras(T[] dato1){
        return "Elementos "+dato1.length;
    }
}