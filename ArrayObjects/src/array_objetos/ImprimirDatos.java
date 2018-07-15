package array_objetos;

import java.util.Scanner;

public class ImprimirDatos{
    Persona[] persona;
    Scanner entrada = new Scanner(System.in);
    public void LenadoDatos(){
        try{
        System.out.println("Digite el numero de elementos ");
        int nElementos = entrada.nextInt();
        if(nElementos>0){
            persona = new Persona[nElementos];
            String nombre,app;
            int edad;
            for(int i=0;i<persona.length;i++){
                System.out.println("\nUser "+(i+1)+"\n"+"Digite nombre:");
                nombre = entrada.next();
                System.out.println("User "+(i+1)+"\n"+"Digite apellido:");
                app = entrada.next();
                System.out.println("User "+(i+1)+"\n"+"Digite la edad:");
                edad = entrada.nextInt();
                persona[i] = new Persona(nombre,app,edad);
            }
            for(int i=0;i<persona.length;i++){
                System.out.println("Usuario: "+i+" "+persona[i].MostraDatos());
                System.out.println("--------------------------------\n");
            }
        }
        else{
            System.out.println("Dato no valido. Vuelva a intentar");
        }
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Digito mal elaborado");

        }
    }
}