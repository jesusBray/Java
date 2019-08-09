
public class Main {

    public static void main(String[] args) {
        

        int array[] = new int[0];
        
        array = addItem(array,1);
        //array={1}
        array = addItem(array,2);
        //array={1,2}
        array = addItem(array,3);
        //array={1,2,3}
        array = addItem(array,4);
        //array={1,2,3,4}
        array = addItem(array,5);
        
        array = addItem(array,6);
        
        array = addItem(array,7);
//        array = addItem(array,20);
//        
//        int vec1[]={1,2,3};int vec2[]={1,1,1,1};
//        
//        vec1 = vec2;
//        System.out.print("[");
//        for (int i : vec1) {
//            System.out.print(i+" ");
//        }
//        System.out.println("]");
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static int[] addItem(int[] array, int i){
        int vec[]= new int[array.length+1];
        System.out.println("encima del bucle "+array.length);
        for (int j = 0; j < array.length; j++) {
            System.out.println("test bucle"+array[j]);
            System.out.println(vec[j]+" < "+array[j]+" ?");
            vec[j]=array[j];
            
            System.out.println(vec[j]+" <= "+array[j]);
        }
        vec[array.length]=i;
        System.out.println("debajo del bucle ");
        return vec;
    }

    
}
