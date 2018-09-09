
package Colegio;

public class usuario {
    
    String nombre;
    String apellido;
    int id_materias;

    public usuario(String nombre, String apellido, int id_materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_materias = id_materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_materias() {
        return id_materias;
    }

    public void setId_materias(int id_materias) {
        this.id_materias = id_materias;
    }
    
}
