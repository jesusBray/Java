package classusinglambdas.contenedorExamples.example1;

import java.util.ArrayList;
import java.util.Collections;

public class example1 {
    
    public void ordenarLambda(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("jorge");
        lista.add("jose");
        lista.add("felipe");
        lista.add("rodrigo");
        
        Collections.sort(lista, (String a1,String a2) -> a1.compareTo(a2));
        for (String string : lista) {
            System.out.println(string);
        }
    }
}
