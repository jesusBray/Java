
import java.util.Random;
import java.util.Scanner;


public class main {
    
    private int[][]matriz;
    private Scanner entrada = new Scanner(System.in);
    private Random aleatorio = new Random();
    private int elemento1,elemento2;
    
    private int elemento(String txt) {
        System.out.println(txt);
        return entrada.nextInt();
    }
    
    public int[][]matriz(){
        matriz = new int[elemento("Digite el numero de filas")][elemento("Digite el numero de columnas")];
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz1[j] = aleatorio.nextInt(9);
    }
        }
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz1[j] + " ");
            }
            System.out.println();
        }
        return matriz;
    }
    
    public void sumaMatricial(int[][] a,int[][]b){
        int[][] m = new int[a[0].length][b.length];
        System.out.println("\nSuma total de las matrices a,b = ");
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = a[i][j]+b[i][j];
                System.out.print(" "+m[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        main m = new main();
        m.sumaMatricial(m.matriz(), m.matriz());
    }

    
}
