
package com.ListaPrincipal.Busqueda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AsignarConsulta {
    
    private final String INSERT = "INSERT INTO usuario(id_user, nombre, apellido, edad, telefono) VALUES(?, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE usuario SET id_user= ? , nombre= ?, apellido= ?, edad= ?, telefono= ? WHERE id_user = ?";
    private final String DELETE = "DELETE FROM usuario WHERE id_user = ?";
    private final String GETALL = "SELECT * FROM usuario";
    private final String GETONE = "SELECT * FROM usuario WHERE id_user= ?";
    
    private AsignarConsulta asignarConsulta = null;
    private Connection coneccion = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private String campo,buscarDato;
    private int buscarDatoInt;
    
    public AsignarConsulta getAsignarConsulta() {
        return asignarConsulta;
    }

    public int getBuscarDatoInt() {
        return buscarDatoInt;
    }

    public void setBuscarDatoInt(int buscarDatoInt) {
        this.buscarDatoInt = buscarDatoInt;
    }
    
    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getBuscarDato() {
        return buscarDato;
    }

    public void setBuscarDato(String buscarDato) {
        this.buscarDato = buscarDato;
    }
    
    public void setAsignarConsulta(AsignarConsulta asignarConsulta) {
        this.asignarConsulta = asignarConsulta;
    }

    public Connection getConeccion() {
        return coneccion;
    }

    public void setConeccion(Connection coneccion) {
        this.coneccion = coneccion;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
    public String QueriesDeBusquedaCadena(){
        return "select * from usuario where "+campo+" like '%"+buscarDato+"%' ";
    }
    
    public String QueriesDeBusquedaInt(){
        return "select * from usuario where "+campo+"= "+buscarDato+" ";
    }
    
}
