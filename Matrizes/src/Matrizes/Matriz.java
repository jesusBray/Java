package Matrizes;

public class Matriz{
    private int fila,columna;

    public Matriz(int fila,int columna){
        this.fila=fila;
        this.columna=columna;
    }

    public String MostrarDatos(){
        return "Datos: ["+fila+"] ["+columna+"]";
    }
}