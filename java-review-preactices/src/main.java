
import java.util.Scanner;
import sun.applet.Main;


public class main {
    
    public void Recibe( )
 {   // Abre metodo Recibe
 double x1;
 double y1;
 double x2;
 double y2;
 double distancia;

 Scanner entrada = new Scanner(System.in);
  
 System.out.println("\nPor favor introduzca la coordenada x del primer punto: ");
 x1 = entrada.nextDouble();
   
 System.out.println("\nPor favor introduzca la coordenada y del primer punto: ");
 y1 = entrada.nextDouble();
  
 System.out.println("\nPor favor introduzca la coordenada x del segundo punto: ");
 x2 = entrada.nextDouble();
  
 System.out.println("\nPor favor introduzca la coordenada y del segundo punto: ");
 y2 = entrada.nextDouble();

 distancia = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );

 System.out.printf("\nLa distancia entre los puntos es: %.2f\n", distancia);
     
    
 }
    
    
    Scanner entrada = new Scanner(System.in);
    public int puntos(String message){
        System.out.println(message);
        int dato = entrada.nextInt();
        return dato;
    }
    
    public void calcular(int x1,int x2, int y1, int y2){
        System.out.println("El resultado es: "+Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
    
    public static void main(String[] args) {
        main m = new main();
        m.calcular(m.puntos("Digite la coordenada x1"), m.puntos("Digite la coordenada x2"), m.puntos("Digite la coordenada y1"), m.puntos("Digite la coordenada y2"));
        //m.Recibe();
    }
    
}
