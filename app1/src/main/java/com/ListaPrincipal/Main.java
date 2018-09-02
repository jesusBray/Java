package com.ListaPrincipal;

import com.ListaPrincipal.ClassUsings.Moderador;

public class Main {
    
    public static void main( String[] args ) {
        
        //"/home/jesus/Desktop/Props.properties"
        
        Moderador asignar = new Moderador();
        System.out.println(asignar.EjecutarMiConsulta("id_user", 1));
        asignar.CerrarBD();
        
    }
}
