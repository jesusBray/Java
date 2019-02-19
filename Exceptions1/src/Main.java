
public class Main {

    
    public static void main(String[] args) {
        
    }
    
    
    public static void metho1(){
        try {
            System.out.println(10/0);
        } catch (MiException e) {
            
        }
    }
    
}
class MiException extends Exception{

    public MiException(String name) {
        super(name);
    }
    
}
