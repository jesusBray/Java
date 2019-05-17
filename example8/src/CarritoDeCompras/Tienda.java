
package CarritoDeCompras;

public class Tienda {

    private Producto[] stokProductos;

    public Tienda() {
         stokProductos = new Producto[0];
    }
    
    public void agregarProducto(Producto newProducto){
        Producto[] nuevoStokProductos = new Producto[this.stokProductos.length+1];
        System.arraycopy(this.stokProductos, 0, nuevoStokProductos, 0, this.stokProductos.length);
        nuevoStokProductos[this.stokProductos.length] = newProducto;
        stokProductos = nuevoStokProductos;
    }
    
    public void imprimirDatos(){
        for (Producto stokProducto : stokProductos) {
            System.out.println(stokProducto.toString());
        }
    }
    
    public Producto getElementById(int id){
        for (Producto stokProducto : stokProductos) {
            if (stokProducto.getId_producto() == id) {
                return stokProducto;
            }
        }
        return null;
    }
}