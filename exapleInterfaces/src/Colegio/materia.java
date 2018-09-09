
package Colegio;

public class materia {
    String nombre;
    int  cargaHoraria;
    int id_usuario;

    public materia(String nombre, int cargaHoraria, int id_usuario) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "materia{" + "nombre=" + nombre + ", cargaHoraria=" + cargaHoraria + ", id_usuario=" + id_usuario + '}';
    }
    
    
}
