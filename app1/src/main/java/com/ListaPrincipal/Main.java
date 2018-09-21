package com.ListaPrincipal;

import com.ListaPrincipal.ClassUsings.Usuario;
import com.ListaPrincipal.getClass.getUsuario;
import java.util.ArrayList;

public class Main {
    
    public static void main( String[] args ) {
        
        //"/home/jesus/Desktop/Props.properties"
        getUsuario gu = new getUsuario();
        gu.DBConnect();
        ArrayList<Usuario>lista = gu.GetAll();
        
//        lista.forEach((usuario) -> {
//            System.out.println(usuario.toString());
//        });
        
        gu.EjecutarMiConsultaBusqueda("nombre", "jesus").forEach((usuario) -> {
            System.out.println(usuario.toString());
        });
    }
}
