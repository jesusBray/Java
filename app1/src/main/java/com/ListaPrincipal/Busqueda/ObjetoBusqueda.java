package com.ListaPrincipal.Busqueda;

import com.ListaPrincipal.ClassUsings.Usuario;
import com.ListaPrincipal.getClass.getUsuario;
import java.util.ArrayList;

public class ObjetoBusqueda {
    private getUsuario using = null;
    private ArrayList<Usuario>lista = null;
    
    public ArrayList<Usuario> buscarCampo1(int buscarId){
        using = new getUsuario();
        using.DBConnect();
        return using.EjecutarMiConsultaBusqueda("id_user", buscarId);
    }
    
    public ArrayList<Usuario> buscarCampo2(String buscarNombre){
    using = new getUsuario();
        using.DBConnect();
        return using.EjecutarMiConsultaBusqueda("nombre", buscarNombre);
    }
    
    public ArrayList<Usuario> buscarCampo3(String buscarApellido){
        using = new getUsuario();
        using.DBConnect();
        return using.EjecutarMiConsultaBusqueda("apellido", buscarApellido);
    }
    
    public ArrayList<Usuario> buscarCampo4(int buscarEdad){
        using = new getUsuario();
        using.DBConnect();
        return using.EjecutarMiConsultaBusqueda("edad", buscarEdad);
    }
    
    public ArrayList<Usuario> buscarCampo5(int buscarTelefono){
        using = new getUsuario();
        using.DBConnect();
        return using.EjecutarMiConsultaBusqueda("telefono", buscarTelefono);
    }
    
    public void buscarDato(String buscarDato){
        if (buscarCampo1(validateTypography(buscarDato))!= null) {
            using = new getUsuario();
            lista = buscarCampo1(validateTypography(buscarDato));
            for (Usuario usuario : lista) {
                System.out.println(usuario.toString());
            }
        }
        else{
            if (buscarCampo2(buscarDato)!= null) {
                lista = buscarCampo2(buscarDato);
                for (Usuario usuario : lista) {
                System.out.println(usuario.toString());
                }
            }else{
                if (buscarCampo3(buscarDato)!= null) {
                    lista = buscarCampo3(buscarDato);
                    for (Usuario usuario : lista) {
                    System.out.println(usuario.toString());
                    }
                }else{
                    if (buscarCampo4(validateTypography(buscarDato))!=null) {
                        lista = buscarCampo4(validateTypography(buscarDato));
                        for (Usuario usuario : lista) {
                            System.out.println(usuario.toString());
                        }
                    }else{
                        if (buscarCampo5(validateTypography(buscarDato))!= null) {
                            lista = buscarCampo4(validateTypography(buscarDato));
                            for (Usuario usuario : lista) {
                            System.out.println(usuario.toString());
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int validateTypography(String validarNumero) {
        for (int i = 0; i < validarNumero.length(); i++) {
            if (!Character.isDigit(validarNumero.charAt(i)))
                return 0;
        }
        return Integer.parseInt(validarNumero);
    }
    
}
