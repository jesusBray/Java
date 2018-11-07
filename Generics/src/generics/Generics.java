package generics;
import java.util.ArrayList;

public class Generics {
    
    public void mostrarLista(ArrayList<?> listar){
        listar.forEach((ob)->{
            if(ob instanceof Profesor){
                System.out.println("Nombre: "+((Profesor)ob).getNombre()+"\tApellido: "+((Profesor)ob).getApellido()+"\tMateria: "+((Profesor)ob).getMateria());
            }else if(ob instanceof Estudiante){
                    System.out.println("Estudiante: "+((Estudiante)ob).getNombre()+"\tApellido: "+((Estudiante)ob).getNombre());
            }
        });
    }
    
    public static void main(String[] args) {
        Generics ordenar = new Generics();
        ArrayList<Persona> listaProfesor = new ArrayList<>();
        ArrayList<Persona> listaEstudiante = new ArrayList<>();
        
        listaProfesor.add(new Profesor("jesus", "paye","ingles"));
        listaProfesor.add(new Profesor("roberth", "bataheon","matematica"));
        listaProfesor.add(new Profesor("roberta", "aegon","literatura"));
        listaProfesor.add(new Profesor("abiel", "targarian","fisica"));
        listaProfesor.add(new Profesor("zuriel", "elish","deportes"));
        
        listaEstudiante.add(new Estudiante("jesus", "paye"));
        listaEstudiante.add(new Estudiante("roberth", "bataheon"));
        listaEstudiante.add(new Estudiante("roberta", "aegon"));
        listaEstudiante.add(new Estudiante("abiel", "targarian"));
        listaEstudiante.add(new Estudiante("zuriel", "elish"));
        
        ordenar.mostrarLista(listaEstudiante);
        ordenar.mostrarLista(listaProfesor);
        
    }
}
