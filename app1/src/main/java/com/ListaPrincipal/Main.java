package com.ListaPrincipal;

import com.ListaPrincipal.ClassUsings.Usuario;
import com.ListaPrincipal.getClass.getUsuario;
import java.util.ArrayList;


public class Main {
    
    public static void main( String[] args ) {
        
        //"/home/jesus/Desktop/Props.properties"
        getUsuario using = new getUsuario();
        ArrayList<Usuario>lista;
        
        using.DBConnect();
        lista = using.GetAll();
        for (Usuario usuario : lista) {
            System.out.println(usuario.toString());
        }
        using.CerrarBD();
    }
}
