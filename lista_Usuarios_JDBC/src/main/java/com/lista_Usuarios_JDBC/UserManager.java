package com.lista_Usuarios_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserManager {
    private ConectionSql conn = null;
    private Statement declaración = null;
    private PreparedStatement miSentencia = null;
    private ResultSet resultado = null;
    private String buscarApp = null;
    
    public UserManager(ConectionSql conn){
        this.conn = conn;
    }
    
    public PreparedStatement ConnectedQueryPrepared(String consulta){
        conn.isConnected();
            try {
                System.out.println("coneccion establecida");
                return  miSentencia = conn.Connect().prepareStatement(consulta);
            } catch (Exception e) {
                System.out.println("Error en la consulta!"+e.getMessage());
            }
        return miSentencia; 
    }
    
    public ResultSet PreparedStatementQuery(String buscarApp){
        try {
            System.out.println("verifcando datos ");
            ConnectedQueryPrepared("select cargo, nombre, apellido, sueldo from dato_empleado where apellido=?");
            miSentencia.setString(1, buscarApp);
            return resultado = miSentencia.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en respuesta Busqueda! "+e.getMessage());
        }
        return resultado;
    }
    
    public void ShowSearchUser(String dato) {
        int i=0;
        try {
            System.out.println("datos enlasados ");
            PreparedStatementQuery(dato);
            while (resultado.next()) {
                i++;
                System.out.println("Cargo: "+resultado.getString(1)+" Nombre: "+resultado.getString(2)+" Apellido: "+resultado.getString(3)+" Salario: "+resultado.getInt(4));
            }
            System.out.println("Total hallados: "+i);
        } catch (Exception e) {
            System.out.println("Error en la coneccion..."+e.getMessage());
        }
    }
    
    //este metodo uetra todos los usuarios ojo al charque
    public void ShowUsers(){
        try {
            ConnectWithAllUsers();
            ExecuteConnectionQuery("select * from dato_empleado");
            System.out.println("query completado actualisando datos");
            while(resultado.next()){
                String id_usuario = resultado.getString(1);
                String cargo = resultado.getString(2);
                String nombre = resultado.getString(3);
                String apellido = resultado.getString(4);
                String sueldo = resultado.getString(5);
                System.out.println("ID usuario: "+id_usuario+"\t Cargo: "+cargo+"\tNombre: "+nombre+"\tApellido: "+apellido+"\tSueldo: "+sueldo);
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("error en la coneccion usuarios");
        }
    }
    
    // este metodo solo es usable para querys preparadas
    public Statement ConnectWithAllUsers() {
        try {
            System.out.println("coversion notable ");
            return declaración = conn.Connect().createStatement();
        } catch (Exception e) {
            System.out.println("error en el metodo ConnectWithAllUsers()");
        }
        return declaración;
    }
    
    public ResultSet ExecuteConnectionQuery(String query) {
        try {
            return resultado = ConnectWithAllUsers().executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en las consultas."+e.getMessage());
        }
        return resultado;
    }
    
    public void AddUser(String id_usuario,String cargo,String nombre,String app,int salario) {
        try {
            ConnectedQueryPrepared("INSERT INTO dato_empleado"
                + " VALUES"
                + "(?,?,?,?,?)");
            miSentencia.setString(1, id_usuario);
            miSentencia.setString(2, cargo);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, app);
            miSentencia.setInt(5, salario);
            miSentencia.executeUpdate();
            System.out.println("usuario guardado con exito");            
        } catch (Exception e) {
            System.out.println("error en la adicion de usuarios"+e.getMessage());
        }
    } 
    
    public int RemoveUser(String deleteUser){
        try {
            ConnectedQueryPrepared("DELETE FROM dato_empleado where id_usuario=?");
            miSentencia.setString(1, deleteUser);
            System.out.println("Eliminado con exito");
            return miSentencia.executeUpdate();
        } catch (Exception e) {
            System.out.println("error en la eliminacion del usuario"+e.getMessage());
        }
        return 0;
    }
    public void EditUser(String id_usuarioEdit,String id_usuario,String cargo,String nombre,String app,int salario){
        ConnectedQueryPrepared("UPDATE dato_empleado SET id_usuario= ?, cargo= ?, nombre= ?, apellido= ?, sueldo= ? WHERE id_usuario= ?");
        try {
            miSentencia.setString(1, id_usuario);
            miSentencia.setString(2, cargo);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, app);
            miSentencia.setInt(5, salario);
            miSentencia.setString(6, id_usuarioEdit);
            miSentencia.executeUpdate();
            System.out.println("usuario guardado con exito");
        } catch (Exception e) {
            System.out.println("error en la adicion de usuarios"+e.getMessage());
        }
    }





    
}