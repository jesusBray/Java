package DistanciaDosPuntos;

import javax.swing.JOptionPane;
public class Distancia{

	private double resp;
	//							  x1y1		
	Asignar asignar, asignar2;
	//							  x2y2	
	public Asignar getEntrada() {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite las Cordenadas x"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite las Cordenadas y"));
		return new Asignar(num1,num2);
	}

	public void setLlenar() {
		asignar = getEntrada();
		asignar2 = getEntrada();
	}

	public void setSolucion(){
		resp = Asignar.Puntos(asignar);
	}

	public void Imprecion(){
		System.out.println(resp);
	}	
	public int getasdda(){


		return o;
	}
}