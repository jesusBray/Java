
public class polimorfismo implements PolimorfismoInterface{
    
    
    
    
    public static void main(String[] args) {
        PolimorfismoInterface p = new polimorfismo();
        System.out.println(p.toString());
    }

    @Override
    public int edad() {
        return 9;
    }

    @Override
    public String nombre() {
        return "jesus";
    }
    

}
