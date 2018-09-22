
package lambdas8;

public class Usuario {

    private String nombre,cargo;
    private int id;

    public Usuario(int id,String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
       
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cargo=" + cargo + ", id=" + id + '}';
    }
}
