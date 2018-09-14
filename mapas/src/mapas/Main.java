package mapas;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        
        Empleado e;
        Listar l = new Listar();
        HashMap<Integer , Empleado> listMap = l.listador();
        for (Map.Entry<Integer, Empleado> lista : listMap.entrySet()) {
            System.out.println(lista.toString());
        }
        
        
        
        
        
//        listMap.put("1JP2", new Empleado("Jesus", "Paye", 23));
//        listMap.put("2PE2", new Empleado("Pedro", "Ernandes", 20));
//        listMap.put("3JP2", new Empleado("Juan", "Paredes", 20));
//        listMap.put("4PM2", new Empleado("Patric", "Mamami", 23));
//        listMap.put("5CP3", new Empleado("Caleb", "Perez", 30));
          
        
        
        
//        for (Map.Entry<String, Empleado> lista : listMap.entrySet()) {
//            System.out.println(lista.getKey()+": "+lista.getValue());
//        }
    }
    
}
