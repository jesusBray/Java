
package com.ListaPrincipal.ClassUsings;

public class Productos {
    
    private int id_producto,precio;
    private String nombre;

    public Productos(int id_producto, String nombre, int precio) {
        this.id_producto = id_producto;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
