/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarritoDeCompras;

/**
 *
 * @author jesusbook
 */
class Producto {
   private final int id_producto,costo;
   private final String nombre;

    public Producto(int id_producto, String nombre, int costo) {
        this.id_producto = id_producto;
        this.costo = costo;
        this.nombre = nombre;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", costo=" + costo + ", nombre=" + nombre + '}';
    }
   
   
   
}
