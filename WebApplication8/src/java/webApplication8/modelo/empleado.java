
package webApplication8.modelo;

public class empleado {
    int id,salario;
    String nombre;
    
    public empleado(int id, String nombre, int salario) {
        this.id = id;
        this.salario = salario;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "empleado{" + "id=" + id + ", salario=" + salario + ", nombre=" + nombre + '}';
    }
    
}
