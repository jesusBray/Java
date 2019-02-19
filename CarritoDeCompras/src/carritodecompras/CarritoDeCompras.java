package carritodecompras;
public class CarritoDeCompras {
    
    private Tienda tienda;
    private ItemDeCompra[]items;
    
    public CarritoDeCompras (Tienda tienda){
        this.tienda=tienda;
        this.items = new ItemDeCompra[0];
        
    }
    
    public void agregarItem(int cantidad, int id){
        Producto producto =  tienda.getElementById(id);
        ItemDeCompra ic = new ItemDeCompra(cantidad, producto);
        ItemDeCompra[] nuevo = new ItemDeCompra[items.length+1];
        System.arraycopy(items, 0, nuevo, 0, items.length);
        nuevo[items.length]=ic;
        items=nuevo;
    }
    
    public void imprimir(){
        double precio = 0;
        for (ItemDeCompra ic : items) {
            ic.imprimir();
            precio += ic.getPrecioTotal();
        }
        System.out.println("TOTAL: " + precio);
        System.out.println("*********************************");
    }
    
    public static void main(String[] args) {
    
        Tienda computerShop = new Tienda();
        computerShop.agregarProducto(new Producto(1, "Sony PS4", 3000));
        computerShop.agregarProducto(new Producto(2, "Sony TV", 5000));
        computerShop.agregarProducto(new Producto(3, "Dell XPS", 3200));
        computerShop.agregarProducto(new Producto(4, "Teclado Genius", 50));
        computerShop.agregarProducto(new Producto(5, "Mouse Genius", 20));
        computerShop.imprimir();
        
        CarritoDeCompras cc = new CarritoDeCompras(computerShop);
        cc.agregarItem(1, 1); //primer valor es cantidad, segundo valor es ID del producto
        cc.agregarItem(1, 2);
        cc.imprimir();
        
        CarritoDeCompras cr = new CarritoDeCompras(computerShop);
        cr.agregarItem(15, 3); //primer valor es cantidad, segundo valor es ID del producto
        cr.agregarItem(30, 4);
        cr.agregarItem(30, 5);
        cr.agregarItem(1, 5);
        cr.imprimir();
        
    }
}
