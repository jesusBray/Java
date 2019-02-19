/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritodecompras;

/**
 *
 * @author jesusbook
 */
public class Producto {
    private final int id;
    private final String nombre;
    private final double precio;
    
    public Producto(int id, String nombre, double precio){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public int getId(){
        return id;
    }
    
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void imprimir(){
        System.out.println("ID: " + id + " " + nombre + " (" +
                            precio + ")");
    }
}
