/*
 buen dia para solisitar un arbumento
 */

/**
 *
 * @author jesusbook
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato = 0x12312312;// el numero devuelto esta en binarios (se respera el signo!)
        System.out.println(dato);
        int[] a = new int[10];
        a[1]=017;
        a[2]=016;
        a[3]=015;
        a[4]=014;
        a[5]=013;
        a[6]=012;
        a[7]=011;
        a[8]=010;
        
              int x = -1;
          int y = x >> 7;
          System.out.println("El resultado es: " + String.valueOf(y));
        
        System.out.println(a[1]+", "+a[2]+", "+a[3]+", "+a[4]+", "+a[5]+", "+a[6]+", "+a[7]+", "+a[8]);
        
        
        
    }

}
