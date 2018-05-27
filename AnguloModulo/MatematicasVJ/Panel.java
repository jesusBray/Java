package MatematicasVJ;
import java.awt.*;
import javax.swing.*;
public class Panel extends JFrame{
	private JLabel label;
	private JPanel panel;
	private double arrivaDerecho,arrivaIzquier,abajoDerecho,abajoIzquierdo;
	public Panel(double arrivaDerecho ,double arrivaIzquier,double abajoDerecho,double abajoIzquierdo){
		super("Lineas");
		setSize(10,10);
		setVisible(true);
	}

	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.RED);
		g.drawLine(arrivaIzquier,arrivaDerecho,abajoIzquierdo,abajoDerecho);
	}
	public void grafiquito(){
		System.out.println("Inicion: "+paint()+" Final");
	}
}