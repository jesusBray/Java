package MatematicasVJ;

public class Punto {
	double x1,x2,y1,y2;

	public Punto(double x1,double y1,double x2,double y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public Punto(){}

	public double getModulo(){
		return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
	}

	public double getAngulo(){
		double sumaVectorial = x2-x1;
		return (Math.acos(sumaVectorial/getModulo())*180)/Math.PI;
	}

	public double getAnguloFinal() {
		double resultado = 0;
		if (y2-y1>=0) {
			resultado = getAngulo();
		}else {
			resultado = 360 - getAngulo();
		}
		return resultado;
	}
}