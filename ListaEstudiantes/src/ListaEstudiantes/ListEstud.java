package ListaEstudiantes;
import java.util.Scanner;
import java.util.ArrayList;

public class ListEstud {
    ArrayList<Estudiante> listas;
    Scanner entrada = new Scanner(System.in);
    Estudiante arraEstudiates[],est;
    public ListEstud(){

    }

    public void Inicio() {
        listas = new ArrayList<Estudiante>();
        
        listas.ensureCapacity(5);
        listas.add(new Estudiante("rob",30));
        listas.add(new Estudiante("beto",42));
        listas.add(new Estudiante("ramona",32));
        listas.add(new Estudiante("jesu",22));
        listas.add(new Estudiante("rafael",12));
        listas.trimToSize();
    }

    public void Menu() {
        int i=0;
        for(Estudiante ls:listas) {
            i++;
            System.out.println((i)+"~ "+ls.mostrInfor());
        }
    }

    public void EliminarEstudiantes() {
        System.out.println("Digite el numero a eliminar en listas");
        int eliminarDato =entrada.nextInt();
        if(listas.size()>=eliminarDato){
            listas.remove((eliminarDato-1));
            int it = 0;
            for(Estudiante l:listas) {
                it++;
                System.out.println(it+" "+l.mostrInfor());
            }
        }
        else{
            System.out.println("Ups error vuelva a inicializar!");
        }
    }
    public void AdicionarEstudiantes() {
        System.out.println("Digite el nombre ");
        String nombre = entrada.next();
        System.out.println("Digite la edad ");
        int edad = entrada.nextInt();
        listas.add(new Estudiante(nombre, edad));
        int i = 0;
        for(Estudiante l:listas) {
            i++;
            System.out.println(i+" "+l.mostrInfor());
        }

    }
    public void InprimirDatos() {
        boolean exit = false;
        try {
            do{
                System.out.println("Menu \n 1: Eliminar estudiante \n 2: Añadir estudiante \n 3: Salir");
                    switch(entrada.nextInt()){
                        case 1: EliminarEstudiantes();
                        break;
                        case 2: AdicionarEstudiantes();
                        break;
                        case 3: exit = true;
                        break;
                        default: System.out.println("DATO ERRONEO!");
                    }
            }while(exit != true);
        }catch(ArithmeticException | NumberFormatException  e){
            System.out.println("Usted no digito datos validos ");
        }finally{
            System.out.println("www.Yesvill.com");
        }
    }

}
