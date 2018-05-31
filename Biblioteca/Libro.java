package Biblioteca;
public class Libro{
    
    private String nombre;
    private int paginas;
    private double costo;
    //private char categoria;

    public Libro(){}
    
    public Libro(String nombre,int paginas,double costo){
        this.nombre = nombre;
        this.paginas = paginas;
        this.costo = costo;
    }

    public String MostrarDatos(){
        String datos = "Nombre:"+nombre+"\nPaginas: "+paginas+"\nCosto: "+costo;;
        return datos;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public double getCosto(){
        return costo;
    }

    public void setCosto(double costo){
        this.costo=costo;
    }
}