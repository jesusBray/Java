
public class Main {

    public static void main(String[] args) {
    
        
        int[] array = new int[0];
//        
        array = addElement(array,1);
        array = addElement(array,2);
        array = addElement(array,3);
        array = addElement(array,4);
        array = addElement(array,5);
        for (int i : array) {
            System.out.println(i);
       }
//        int a = sumarDigitos(123);
//        System.out.println(a);
        
//        int a = getMinimo(new int[]{6, 8, 10, 2, 1, 0, 5, 11});
//        System.out.println(a);

//        boolean a = esCapicua(123);
//        System.out.println(a);
    }

    private static int[] addElement(int[] array, int i) {
        int vec[] = new int[array.length+1];
        //cuando hacemos la operacion (array.length+1) aumentamos en 1 el numero de indices
        System.arraycopy(array, 0, vec, 0, array.length); //esta operacion permite adicionar
        //System.out.println(vec[j]+" < "+array[j]+" ?");
        vec[array.length]=i;
        return vec;
    }

    private static int sumarDigitos(int numeroEntrante) {
        String cad =Integer.toString(numeroEntrante);
        String[] cadena = new String[cad.length()];
        // ["1","2","3"];
        int total=0,suma=0;
        for (int i = 0; i < cad.length(); i++) {
            cadena[i] = Character.toString(cad.charAt(i));
            // ["3"] <= '3'
        }
        for (String cadena1 : cadena) {
            suma = Integer.parseInt(cadena1);
            total = total+suma;
        }
        return total;
    }

    private static int getMinimo(int[] array) {
        int aux = array[0] ;
        for (int i = 0; i < array.length-1; i++) {
             // 3
            // {4,3,1}
            if( array[i+1]<= array[i]){
                //System.out.println(array[i]+", "+array[i+1]+", "+aux);
                aux=array[i+1];
            }
            
        }
        return aux;
    }

    private static boolean esCapicua(int numero) {
        
        String cadena = Integer.toString(numero);
        String dato="";
        for (int i = cadena.length()-1; i >= 0 ; i--) {
            dato += Character.toString(cadena.charAt(i));
        }
        return cadena.equals(dato);
    }
    
    private static void method1(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
