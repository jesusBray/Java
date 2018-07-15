package ListaEstudiantes;


public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String n, int c) {
        nombre = n;
        edad = c;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }

    public String mostrInfor() {
        return "Nombre: "+nombre+"    Edad: "+edad;
    }
}
