public class Example1 {

    public static boolean method1(int n, int m){
        if (n > m) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Resut: "+new Example1().method1(2, 3));
    }
}

interface GenerFunctionable<T,V> {

    public T suma(V a, V b);
}