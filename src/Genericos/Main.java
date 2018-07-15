package Genericos;
public class Main {
    public static void main(String[] args) {

        Clase1<String> letra = new Clase1<String>();
        letra.set("Letra inicial");
        System.out.println(letra.get());
        String[] date = {"asd","rufu"};
        System.out.println(Clase1.Palabras(date));

    }
}
