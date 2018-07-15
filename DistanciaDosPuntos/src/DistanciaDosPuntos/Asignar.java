package DistanciaDosPuntos;

public class Asignar{

	private double x,y;

	public Asignar(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	public double Puntos(Asignar punto2){
		return Math.sqrt(Math.pow((punto2.x - x ),2) + Math.pow((punto2.y - y),2));
	}
}