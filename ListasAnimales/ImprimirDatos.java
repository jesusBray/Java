package ListasAnimales;
import java.util.Scanner;
public class ImprimirDatos{
    Animal[] animal;
    Scanner entrada = new Scanner(System.in);
    String nombre,claseAnimal;
    int numAnimal;

    public void LlenadoDatos(){
        try{
        System.out.println("Digite numero de animales: ");
        int nElementos=entrada.nextInt();

        if(nElementos>0){
            animal = new Animal[nElementos];
            for(int i=0;i<animal.length;i++){
                System.out.println("animal "+(i+1)+" Digite nombre  ");
                nombre = entrada.next();
                System.out.println("animal "+(i+1)+" Digite la clase del animal: ");
                claseAnimal = entrada.next();
                System.out.println("animal "+(i+1)+" Digite el numero de animal   ");
                numAnimal = entrada.nextInt();
                animal[i] = new Animal(nombre,claseAnimal,numAnimal);
            }
            for(int i=0;i<animal.length;i++){
                System.out.println((i+1)+animal[i].MostrarDatos());
                System.out.println("------------------\n");
            }
        }
        else{
            System.out.println("Tiene que digitar numeros mayores a 0!");
        }
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException  e){
            System.out.println("Datos ma digitados bad boy");
        }finally{
            System.out.println("Todos los derechos reservados www.Yesvil.com");
        }

        
    }
}