package mapas;

public class Empleado {
    
    private String nombre,apellido;
    private int edad;
    
    public Empleado(String nombre,String apellido, int edad) {
        this.nombre=nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad;
    }
}
