
package com.ListaPrincipal.ClassUsings;

public class Usuario {
    
    private int id_user,edad,telefono;
    private String nombre,apelldio;
    private int id_busqueda;
    
    public Usuario(int id_user,String nombre, String apelldio,int edad, int telefono) {
        this.id_user = id_user;
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apelldio = apelldio;
    }

    public Usuario(int id_user) {
        this.id_user = id_user;
    }
    

    public int getId_busqueda() {
        return id_busqueda;
    }

    public void setId_busqueda(int id_busqueda) {
        this.id_busqueda = id_busqueda;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_user=" + id_user + ", edad=" + edad + ", telefono=" + telefono + ", nombre=" + nombre + ", apelldio=" + apelldio + '}';
    }
    
    
}
