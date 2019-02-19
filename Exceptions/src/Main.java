
public class Main {
    public static void main(String[] args) {
        
        
        
        
        method1();
        
        
    }
    
    
    public static void method1(){
        
        
        MyException me = new MyException("dato incompatible!");
        
        System.out.println(me.getMessage());
        
    }
    
}
