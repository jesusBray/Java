package carritodecompras;

class ItemDeCompra {

    private final int cantidad;
    private final Producto producto;
    
    ItemDeCompra(int cantidad, Producto producto) {
        this.producto=producto;
        this.cantidad=cantidad;
    }
    
    public double getPrecioTotal(){
        return cantidad * producto.getPrecio();
    }
    
    public void imprimir(){
                System.out.println(cantidad +
                " " + producto.getNombre()
                    + " PU: " + producto.getPrecio()
                    + "; PT: " + getPrecioTotal());
                
                
                
    }
}
