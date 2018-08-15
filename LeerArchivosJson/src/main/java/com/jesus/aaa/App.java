package com.jesus.aaa;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

//import org.json.JSONArray;
//import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Iterator;

public class App {
    
    public static void main( String[] args ) {
        JSONParser parser = new JSONParser();
        try{
                Object obj = parser.parse(new FileReader("/home/jesus/Desktop/archiboJson.json"));

                JSONObject jsonObject = (JSONObject) obj;

                String nombre = (String) jsonObject.get("nombre");
                System.out.println("nombre:"+nombre);

                long edad = (Long) jsonObject.get("edad");
                System.out.println("edad:"+edad);

                // recorrer arreglo
                JSONArray leng= (JSONArray) jsonObject.get("lenguajes_favoritos");
                System.out.println("lenguajes_favoritos:");
                Iterator iterator =leng.iterator();
                while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                }

        }catch(Exception ex){
                System.err.println("Error: "+ex.toString());
        }finally{
        }
    }
}
