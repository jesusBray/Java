
import java.util.ArrayList;
import ejemplo.*;
    
public class main {
    
    public void listador(ArrayList<?> lista){
        lista.forEach(x->{
            if(x instanceof Persona.Profesor)
                System.out.println("Nombre: "+((Persona.Profesor)x).getNombre()+"\tApellido: "+((Persona.Profesor)x).getApellido()+"tMateria: "+((Persona.Profesor)x).getMateria());
            else if(x instanceof Persona.Alumno)
                System.out.println("Nombre: "+((Persona.Alumno)x).getNombre()+"\tApellido: "+((Persona.Alumno)x).getApellido());
            else{
                if(x instanceof mostarInterfaces)
                    System.out.println("Nom1: "+((Interface)x).nombre1()+"\tApellido: "+((Interface2)x).apellido1()+"\tApellido"+((Interface2)x).apellido2());
                else
                    System.out.println("Apellido1: "+((Interface)x).nombre2()+"\tApellido2: "+((Interface2)x).apellido4()+"\tApellido: "+((Interface2)x).apellido5());
            }
        });
        
    }
    
    public ArrayList<?> lista ;
    
    
    public static void main(String[] args) {
        main m = new main();
        
        Persona p = new Persona();
        ArrayList<Persona> lista,lista2,lista3 ;
        
        ArrayList<String> listaNombres,n,cv;
        listaNombres = new ArrayList<>();
        ArrayList<String> listaApellido = new ArrayList<>();
        //ArrayList<mostarInterfaces> lista2 = new ArrayList<>();
        //forma 1 de instancear una clase anidad
        Persona.Profesor per1 = new Persona().new Profesor("roberta","cadena","literatura");
        Persona.Profesor per2 = new Persona().new Profesor("rodrrigo","cordova","literatura");
        Persona.Profesor per3 = new Persona().new Profesor("ruben","","literatura");
        Persona.Profesor per4 = new Persona().new Profesor("abiel","robustiano","literatura");
        Persona.Profesor per5 = new Persona().new Profesor("zuriel","zuares","literatura");
        Persona.Profesor per6 = new Persona().new Profesor("jesus","solis","literatura");
        Persona.Profesor per7 = new Persona().new Profesor("abimael","caleb","literatura");
        //forma 2 de instancear una clase anidada
        Persona.Profesor per = p.new Profesor("zuriel","aegon","historia");
        mostarInterfaces mi = new mostarInterfaces();
        listaNombres.add(new mostarInterfaces().nombre1());
        listaApellido.add(new mostarInterfaces().apellido1());
        listaApellido.add(new mostarInterfaces().apellido2());
        
        ///averiguar como estan funcionando las referenias en las listas!
        lista = new ArrayList<>();
        lista.add(new Persona().new Profesor("jesus","persona","literatura"));
        lista.add(new Persona().new Profesor("roberth","conde","fisica"));
        lista.add(new Persona().new Profesor("abiel","zaragosa","literatura"));
        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        lista.add(per4);
        lista.add(per5);
        lista.add(per6);
        lista.add(per7);
        m.listador(lista);
        
    }
    
}
