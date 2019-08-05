/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

/**
 *
 * @author jesusbook
 */
public class Persona {
    
    public String nombre;
            
    public Persona(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public String toString() {
        return String.format("Nombre: %s", nombre);
    }
    
}
