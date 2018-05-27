package MatematicasVJ;

import java.util.Scanner;

public class InterMed {
	Punto producto;
	private String nombreModulo,nombreAngulo;

	public InterMed(Punto producto,String nombreModulo,String nombreAngulo){
		this.producto = producto;
		this.nombreModulo = nombreModulo;
		this.nombreAngulo = nombreAngulo;
	}

	public void Puntos(){
		System.out.println("El Punto X: "+producto.x2+"\nEl Punto Y: "+producto.y2);
	}

	public void Modulo(){
		System.out.println(nombreModulo+" es: "+producto.getModulo());
	}

	public void Angulo(){
		System.out.println(nombreAngulo+" es: "+producto.getAnguloFinal());
	}
}