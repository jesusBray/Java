
package arraysexample;

public class ArraysExample {

    public static void main(String[] args) {
        int a=0 ,b=1;
        int[] arr = new int[0];
        arr = adicionarArray(arr, 1);
        arr = adicionarArray(arr, 2);
        arr = adicionarArray(arr, 3);
        arr = adicionarArray(arr, 4);
        arr = adicionarArray(arr, 5);
        arr = adicionarArray(arr, 6);
        arr = adicionarArray(arr, 7);
        arr = adicionarArray(arr, 8);
        arr = adicionarArray(arr, 9);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"posicion :"+i);
        }                
        
    }

    private static int[] adicionarArray(int[] arr, int i) {
        int array[] = new int[arr.length+1];
        System.arraycopy(arr, 0, array, 0, arr.length);
        array[arr.length] = i;
        return array;
    }
}
