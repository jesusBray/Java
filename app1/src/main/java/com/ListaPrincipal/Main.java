package com.ListaPrincipal;

import com.ListaPrincipal.ClassUsings.Usuario;
import com.ListaPrincipal.getClass.getUsuario;

public class Main {
    
    public static void main( String[] args ) {
        
        //"/home/jesus/Desktop/Props.properties"
        getUsuario gu = new getUsuario();
        gu.DBConnect();
        gu.EjecutarMiConsultaBusqueda("nombre", "pepito").forEach((Usuario usuario) -> {
            System.out.println(usuario.toString());
        });
    }
}
