package Matrizes;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int[][] mz;

        System.out.println("Digite numero de columnas de la matriz");
        int filas = entrada.nextInt();
        System.out.println("Digite numero de columnas de la matriz");
        int columnas = entrada.nextInt();
        mz = new int[filas][columnas];
        
        System.out.println("Digite numero de elementos de la matriz");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                mz[i][j] = entrada.nextInt();
            }
        }

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(mz[i][j]);
            }
            System.out.print("");
        }
        System.out.println("reposito java");
    }
}