package array_objetos;
public class Persona{
    String nombre, app;
    int edad;
    public Persona(String nombre,String app,int edad){
        this.nombre=nombre;
        this.app=app;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombe(String nombre){
        this.nombre=nombre;
    }

    public String getApp(){
        return app;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String MostraDatos(){
        return "Datos personales: \nNombre "+nombre+"\nApellido: "+app+"\nEdad: "+edad;
    }
}