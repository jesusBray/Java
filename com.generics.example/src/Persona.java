
public class Persona {
    
    private String nombre,apellido;
    
    public Persona(){};
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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
    
    
    
    
    protected class Profesor extends Persona{
        
        private String materia;
        public Profesor(String nombre, String apellido,String materia) {
            super(nombre, apellido);
            this.materia=materia;
        }

        public String getMateria() {
            return materia;
        }

        public void setMateria(String materia) {
            this.materia = materia;
        }
        
    }
    
    protected class Alumno extends Persona{
        
        public Alumno(String nombre, String apellido) {
            super(nombre, apellido);
        }
        
    }
    
   
}
