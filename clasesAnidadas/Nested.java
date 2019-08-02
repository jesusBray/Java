
class Other {

    public void method1(Object algo) {
        System.out.println(algo);
    }
    
    class InterClass{
        public int metho1() {
            return 2;
        }
    }    
}

public class Nested {
    
    public static void main(String[] args) {
        Other ot = new Other();
        ot.method1(3+ot.new InterClass().metho1());
    }
}