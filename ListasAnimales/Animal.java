package ListasAnimales;
public class Animal{
    private String nombre, claseAnimal;
    private int numAnimal;
    
    public Animal(String nombre,String claseAnimal,int numAnimal){
        this.nombre = nombre;
        this.claseAnimal = claseAnimal;
        this.numAnimal = numAnimal;
    }

    public String MostrarDatos(){
        return "Animal: "+nombre+"\nClase del animal: "+claseAnimal+"\nNumero del animal: "+numAnimal;
    }

}