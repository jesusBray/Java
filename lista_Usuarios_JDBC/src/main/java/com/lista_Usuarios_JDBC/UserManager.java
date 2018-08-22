package com.lista_Usuarios_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserManager {
    private ConectionSql conn = null;
    private Statement declaración = null;
    private PreparedStatement miSentencia = null;
    private ResultSet resultado = null;
    
    public UserManager(ConectionSql conn){
        this.conn = conn;
        conn.Connect();
    }
    
    public PreparedStatement ConnectedQueryPrepared(String consulta){
            try {
                return  miSentencia = conn.Connect().prepareStatement(consulta);
            } catch (Exception e) {
                System.out.println("Error en la consulta!"+e.getMessage());
            }
        return miSentencia;
    }
    
    public String datoAsignable(String mensaje){
        return mensaje;
    }

    public ResultSet PreparedStatementQuery(String datosMostrar,String datoBusqueda){
        try {
            ConnectedQueryPrepared("select cargo, nombre, apellido, sueldo from dato_empleado where apellido=?");
            ConnectedQueryPrepared("select "+datosMostrar+" where "+datoBusqueda+"=?");
            miSentencia.setString(1, datoBusqueda);
            return resultado = miSentencia.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en respuesta Busqueda! "+e.getMessage());
        }
        return resultado;
    }
    
    //este metodo ejecuta los parametros a buscar y ejecuta los resultados
    public void ShowSearchUser(String dato) {
        int i=0;
        try {
            //PreparedStatementQuery(dato);
            while (resultado.next()) {
                i++;
                System.out.println("Nombre: "+resultado.getString(1)+" Apellido: "+resultado.getString(2)+" Edad: "+resultado.getString(3)+" Telefono: "+resultado.getInt(4));
            }
            System.out.println("Total hallados: "+i);
        } catch (Exception e) {
            System.out.println("Error en la coneccion..."+e.getMessage());
        }
    }
    
    //este metodo entra en todos los usuarios ojo al charque
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