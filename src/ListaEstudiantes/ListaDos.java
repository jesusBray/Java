package ListaEstudiantes;
import java.util.Scanner;
import java.util.ArrayList;

public class ListaDos {
    Estudiante estudiantes;
    ArrayList<Estudiante> lista;
    public ListaDos(){
        Listado();
    }
    public void Listado(){
        lista = new ArrayList<Estudiante>();
        lista.add(new Estudiante("beto", 21));
        lista.add(new Estudiante("ramona", 22));
        lista.add(new Estudiante("ronaldo", 20));

        lista.remove(0);
        for(Estudiante ls:lista){
            System.out.println(ls.mostrInfor());
        }
        System.out.println("Cantidad estudiantes: " + lista.size());
    }

}
