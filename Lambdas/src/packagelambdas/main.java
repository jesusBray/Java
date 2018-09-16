package packagelambdas;


public class main implements operaciones3F{
    private String apodo = "(tiene apodo)";
    private String etiqueta = "El resultado es: ";
    
    public void operaciones(double a,double b){
        operacionesF op = (x, y) -> {
            return (a + b);
        };
        etiqueta = etiqueta+ op.promedio(a, b);
        System.out.println(etiqueta);
    }
    
    public String  reNombre(String nombramiento){
        operaciones2F op = () -> {
        apodo = apodo + "Nombre: "+nombramiento;
        return apodo;
        };
        return op.reNombrebrado();
    }
    
    public String sumaLambdas() {
        
        operaciones2F op = () -> {
            return etiqueta= etiqueta+reNombre("jesus");
        };
        return op.reNombrebrado();
    }
    
    @Override
    public void metodoDEFAULT(String etiqueta){
        String otraEtiqueta="La etiqueta es: ";
        System.out.println(otraEtiqueta + etiqueta);
        System.out.println("fin de la secuencia en metodos default");
    }
    
    public static void main(String[] args) {
        
        main m = new main();
        m.operaciones(10,50);
        
    }
    
}
