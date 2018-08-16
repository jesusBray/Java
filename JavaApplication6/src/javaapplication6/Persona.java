
package javaapplication6;


public class Persona<T> {
    
    private T dato;
    
    public void set(T dato){
        this.dato = dato;
    }
    
    public T get(){
        return this.dato;
    }
    
    public int NumeroInt(int dato) {
        return (dato > 0 ) ? dato : 0;
    }
    
    public Integer NumeroInt(Integer dato) {
        return (dato == null ) ? dato : 0;
    }
    
    public String Cadena(String numero) {
        return (numero != null) ? "Dato existente."
        : "Dato no existente.";
    }
    
    public boolean Condicional(boolean dato) {
        return (dato == true)? true: false;
    }
    
    public float Desimales(float dato) {
        return (dato > 0) ? dato : 0 ;
    }
    
    public byte numeroByte(byte dato) {
        return (dato > 0)? dato: 0;
    }
    
    public long numeroLong(long dato) {
        return (dato > 0) ? dato : 0;
    }
    
    public char Caracter (char dato){
        return (dato != ' ') ? 'x' : 'x';
    }
    
    public Character Caracter(Character dato) {
        return (dato != null ) ? dato : '>';
    }
    short das;
    
}
