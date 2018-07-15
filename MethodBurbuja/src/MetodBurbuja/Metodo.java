package MetodBurbuja;
import java.util.Scanner;
public class Metodo{
    public int[] MetBurb(){
        Scanner entra = new Scanner(System.in);
        System.out.println("Digite el numero de elementos");
        int nElementos = entra.nextInt();
        int a[] = new int[nElementos];
        
        System.out.println();
        int aux =0;
        for(int i =0;i< nElementos;i++){
            System.out.println("Digite un numero");
            int numer = entra.nextInt();
            a[i]= numer;
            for(int j = 0;j< nElementos -1;j++){
              if(a[j] > a[j+1]){
                  aux = a[j];
                  a[j] = a[j+1];
                  a[j+1] = aux;
              }
            }
        }
    return a;
    }
}