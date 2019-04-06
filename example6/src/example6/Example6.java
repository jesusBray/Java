
package example6;

public class Example6 {

    public static void main(String[] args) {
        
        int[]vec = new int[0];
        
        vec = adicionarElemento(vec,12);
        vec = adicionarElemento(vec,10);
        vec = adicionarElemento(vec,7);
        vec = adicionarElemento(vec,5);
        vec = adicionarElemento(vec,2);
        vec = adicionarElemento(vec,10);
        
        for (int i : vec) {
            System.out.println(i);
        }
        
        
    }
    
    public static int[] adicionarElemento(int[] vec,int valor){
        int[] nuevoVec = new int[vec.length+1];
        System.arraycopy(vec, 0, nuevoVec, 0, vec.length);
        /*for (int i = 0; i < vec.length; i++) {
            nuevoVec[i] = vec[i];
        }*/
        nuevoVec[vec.length] = valor;
        return nuevoVec;
    }
    
}
