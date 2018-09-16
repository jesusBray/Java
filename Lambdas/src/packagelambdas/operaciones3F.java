
package packagelambdas;


public interface operaciones3F {
    final String otraEtiqueta="La etiqueta es: ";
    
    
    default public void metodoDEFAULT(String etiqueta){
        System.out.println(otraEtiqueta + etiqueta);
    }
    
    default public void metodoDEFAULT(String etiqueta,String otraEtiqueta){
        String nombre = this.otraEtiqueta + etiqueta;
        System.out.println(otraEtiqueta + etiqueta + nombre);
    }
}
