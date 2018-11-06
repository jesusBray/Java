package examplelambdas1;

import java.util.ArrayList;
import java.util.List;

public class ExampleLambdas1 <T>{
    
    private ArrayList<String> cadenaNumeros,cadenaNombres;
    private Persona persona;
    protected ArrayList<String> lista(){
        cadenaNumeros = new ArrayList<>();
        cadenaNumeros.add("1");
        cadenaNumeros.add("2");
        cadenaNumeros.add("3");
        return cadenaNumeros;
    }
    
    protected ArrayList<String> lista2(){
        cadenaNombres = new ArrayList<>();
        cadenaNombres.add("Jesus");
        cadenaNombres.add("Zuriel");
        cadenaNombres.add("Abiel");
        cadenaNombres.add("Roberta");
        return cadenaNombres;
    }
    
    public void combercion1(){
        lista().stream().map(x -> Integer.parseInt(x)+2).forEach(System.out::println);
    }
    
    protected <T> void combercion2(ArrayList<? extends T> lista){
        lista().stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    }
    
    public static <T> String clase1(List<? extends T> dato){
        return "Lista inicial: "+dato;
    }    
    
    public void combinacion3(){
        lista2().stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
   }
   
    public void combinacion4(){
        lista2().stream().limit(2).forEach(System.out::println);
    }
    
    public void combinacion5(){
        long num = lista2().stream().count();
        System.out.println("El numero de datos almacenados es: "+num);
    }
    
    public static void main(String[] args) {
        
//        System.out.println(ExampleLambdas1.clase1(new ExampleLambdas1<>().lista2()));
//        otra o = new otra(new ExampleLambdas1<>().lista2());
//        o.metodo1();
        // Tambien puedes instanciar de esta otra forma!
        //new otra(new ExampleLambdas1<>().lista2()).procedimiento();
        new otra(new ExampleLambdas1<>().lista2()).metodo1();
    }
}

class otra extends ExampleLambdas1<String>{
    ArrayList<String> dato;
    public otra(ArrayList<String> dato){
        this.dato=dato;
    }
    
    public void metodo1(){
        System.out.println(clase1(dato));
    }
    
    public void procedimiento(){
        lista2().stream().sorted((a,b)-> a.compareTo(b)).forEach(System.out::println);
        combercion2(dato);
    }
}

class GetClase extends ExampleLambdas1<Persona>{
    
    public ArrayList<Persona> listador(){
        ArrayList<Persona>lista = new ArrayList<>();
        lista.add(new Persona(1, "nombre", "apellido", 0));
        lista.add(new Persona(2, "Jesus", "Paye", 0));
        lista.add(new Persona(3, "Alberto", "Perez", 0));
        lista.add(new Persona(4, "Ramona", "Cadena", 0));
        lista.add(new Persona(5, "Angustia", "Chapo", 0));
        return lista;
    }
    
    
    
}