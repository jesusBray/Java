
package ListaEstudiantes;

public class Usuario {
    private String name, lastName;
    private String age, direction;

    public Usuario() { }
    
    public Usuario(String n,String l,String a,String d) {
        name = n;
        lastName = l;
        age = a;
        direction = d;
    }
   
    public String VerInfo() {
        return "Nombre: "+name+" Apellido: "+lastName+" Edad: "+age+" Direccion: "+direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
   
}
