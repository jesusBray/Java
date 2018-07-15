package MatematicasVJ;
import javax.swing.JOptionPane;

public class Print2 {

	public void platillaInicial() {
		boolean exit=true;
		double vecA =0,x1,x2;
		double vecB =0,y1,y2;
		do{
			x1 = Double.parseDouble(JOptionPane.showInputDialog("Bienvenido"+"\nCordenada x1"));
			y1 = Double.parseDouble(JOptionPane.showInputDialog("Bienvenido"+"\nCordenada y1"));
			x2 = Double.parseDouble(JOptionPane.showInputDialog("Bienvenido"+"\nCordenada x2"));
			y2 = Double.parseDouble(JOptionPane.showInputDialog("Bienvenido"+"\nCordenada y2"));
			InterMed interM = new InterMed(new Punto(x1,y1,x2,y2),"La traslacion es: ","La rotacion es: ");
			interM.Modulo();
			interM.Angulo();
			vecA += (x2-x1);
			vecB += (y2-y1);
			System.out.println("\n\n\nTraslacion: "+"\nA: "+vecA+"   B: "+vecB);

			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar? \n1: si\n2: no"));
			if(opcion == 1){
				exit = true;
			}
			else{
				exit= false;
				System.out.println("Punto Inicial "+vecA+" -----> "+vecB+"Traslacion");
				System.out.println("\nDeveloping Yesvil todos los derechos reservados.....\nPara mas invormacion visitenos en www.Yesvill.com");
			}		
		}while(exit);
	}
}