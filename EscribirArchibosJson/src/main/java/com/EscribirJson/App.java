package com.EscribirJson;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class App 
{
    public static void main( String[] args )
    {
        JSONObject obj = new JSONObject();
            obj.put("nombre", "Fernando");
            obj.put("edad", new Integer(32));

            JSONArray list = new JSONArray();
            list.add("Java");
            list.add("Ceylon");
            list.add("Python");

            obj.put("lenguajes_favoritos", list);

            try{
                    FileWriter file = new FileWriter("/home/jesus/Desktop/escribirJson.json");
                    file.write(obj.toJSONString());
                    file.flush();
                    System.out.println("Escrito corectamente");
                    file.close();

            }catch(Exception ex){
                    System.out.println("Error: "+ex.toString());
            }
            finally{
                    System.out.print(obj);
            }
    }
}
