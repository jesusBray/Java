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
class Tienda {

    private Producto[]productos;
    
    public Tienda(){
        productos = new Producto[0];
    }
    
    public void agregarProducto(Producto p){
        Producto[] ps = new Producto[productos.length+1];
        System.arraycopy(productos, 0, ps, 0, productos.length);
        ps[productos.length]= p;
        productos = ps;
    }
    
    public void imprimir(){
        for (Producto producto : productos) {
            producto.imprimir();
        }
        System.out.println("***********************");
    }
    
    public Producto getElementById(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
}
