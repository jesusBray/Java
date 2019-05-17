package CarritoDeCompras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesusbook
 */
public class Main {

    public static void main(String[] args) {
        Tienda compra = new Tienda();
        compra.agregarProducto(new Producto(1, "monitor", 500));
        compra.agregarProducto(new Producto(2, "mouse", 50));
        compra.agregarProducto(new Producto(3, "equip de sonido", 300));
        compra.agregarProducto(new Producto(4, "mueble", 500));
        compra.agregarProducto(new Producto(5, "cpu", 2500));
        compra.imprimirDatos();
        
        
    }
    
}
