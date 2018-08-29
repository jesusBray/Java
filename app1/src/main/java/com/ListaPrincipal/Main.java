package com.ListaPrincipal;

public class Main {
    
    public static void main( String[] args ) {
        
        //"/home/jesus/Desktop/Props.properties"
        
        Moderador asignar = new Moderador();
        asignar.Path("/home/jesus/Desktop/Props.properties");
        asignar.ObtenerListaUsuarios();
        asignar.CerrarBD();
    }
}
