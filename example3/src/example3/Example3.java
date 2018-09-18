
package example3;

public class Example3 {

    public String resultser(int g, String ... arg){
        return "";
    }
    
    public String resultser(String dato,int ... arg){
        return ""+arg;
    }
    
    public static void main(String[] args) {
        Example3 e= new Example3();
        System.out.println(e.resultser("nombre", 1,2,3,4,5,6,7,8,9,10));
        
    }
    
}
