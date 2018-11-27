package com.examplesJava.example1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Personas{

    public String nombres[] = new String[] {
        "roberta","jesus","zuriel","abiel"
    };
    
    public void method(){
        try {
            Arrays.asList("","");
            Arrays.asList("","").forEach(action);;
            List<String> lista = Arrays.asList("","");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }


        

    

    public static void main(String[] args) {
        
    }
}