import java.util.Scanner;
public class ClaseC{
	private int filas=0,columnas=0,cont=1;
	public void tablero(){
		Scanner entradaDeDatos = new Scanner(System.in);
		System.out.println("Digite el numero de filas.");
		filas = entradaDeDatos.nextInt();
		System.out.println("Digite el numero de columnas");
		columnas = entradaDeDatos.nextInt();
		int[][] matriz = new int[filas][columnas];
		for (int i=0;i<filas ;i++ ) {
			for (int j=0 ;j<columnas ;j++ ) {
				matriz[i][j] = cont;
				cont++;
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.print(" ");
		}
	}







	public static void main(String[] args) {
		ClaseC cc= new ClaseC();
		cc.tablero();
	}
}