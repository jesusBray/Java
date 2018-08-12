package SumaMatrices;

import java.util.Scanner;

public class Suma {
    
    Scanner entrada = new Scanner(System.in);

    int [][] matriz1, matriz2, totalSuma;

    public int TextForTecl(String text) {
        System.out.println(text);
        return entrada.nextInt();
    }
   
    public int[][] Matriz() {
        matriz2 = new int[TextForTecl("Digite columna")][TextForTecl("Digite filas")];
        for(int i = 0;i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[0].length; j++){ 
               matriz2[i][j] = TextForTecl("Digite un digito");
            }
        }
        return matriz2;
    }

    public void verSuma(int[][] m1, int[][] m2) {
        totalSuma = new int[m1[0].length][m2.length];
        for(int i = 0;i < totalSuma.length; i++) {
            for(int j = 0 ;j < totalSuma[0].length; j++){
                totalSuma[i][j] = m1[i][j]+m2[i][j];
            }
        }

        for(int i = 0;i < totalSuma.length; i++) {
            for(int j = 0 ; j<totalSuma[0].length; j++){
                totalSuma[i][j] = m1[i][j]+m2[i][j];
                System.out.print(" "+totalSuma[i][j]+" ");
            }
            System.out.println("");
        }
    }
}