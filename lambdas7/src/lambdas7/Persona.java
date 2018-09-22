
package lambdas7;

public class Persona {
    
    String nombre,gerarquia;
    int id;

    public Persona(int id, String nombre, String gerarquia) {
        this.nombre = nombre;
        this.gerarquia = gerarquia;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGerarquia() {
        return gerarquia;
    }

    public void setGerarquia(String gerarquia) {
        this.gerarquia = gerarquia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", gerarquia=" + gerarquia + ", id=" + id + '}';
    }
    
}
