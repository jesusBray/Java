
package com.ListaPrincipal;

import com.ListaPrincipal.DAO.DAOExseption;
import com.ListaPrincipal.Mysql.UsuarioMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Moderador {
    UsuarioMysql user = null;
    Connection conn = null;
    
    public Moderador(){
        DBConnect();
    }
    
    
    public void DBConnect(){
        DBConfig config = new DBConfig("./config/dbconfig.properties");
        String server = config.getServer();
        String port = config.getPort();
        String db = config.getBaseDato();
        String user = config.getUser();
        String pass = config.getPassword();
        try {
            String stringDriver = MessageFormat.format("jdbc:mysql://{0}:{1}/{2}?autoReconnect=true&useSSL=false", server, port, db);
            System.out.println(stringDriver);
            conn = DriverManager.getConnection(stringDriver, user, pass);
        } catch (SQLException ex) {
            System.out.println("error en :"+ex.getLocalizedMessage());
        }
    }
    
    public void Path(String path) {
        try {
            DBConfig config = new DBConfig(path);
            String server = config.getServer();
            String port = config.getPort();
            String db = config.getBaseDato();
            String user = config.getUser();
            String pass = config.getPassword();
            conn = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+db+"?autoReconnect=true&useSSL=false",user,pass);
        } catch (SQLException ex) {
            System.out.println("error en :"+ex.getLocalizedMessage());
        }
    }

    public void createDB(){
        try {
            DBConfig dbQueryConfig = new DBConfig("./config/dbqueries.properties");
            DBConfig config = new DBConfig("./config/dbconfig.properties");
            String server = config.getServer();
            String port = config.getPort();
            String db = config.getBaseDato();
            String user = config.getUser();
            String pass = config.getPassword();
            String query = dbQueryConfig.getDBCreate();
            String stringDriver = MessageFormat.format("jdbc:mysql://{0}:{1}/{2}?autoReconnect=true&useSSL=false", server, port, db);
            System.out.println(stringDriver);
            conn = DriverManager.getConnection(stringDriver, user, pass);
            UsuarioMysql usuarioMysql = new UsuarioMysql(conn);
            usuarioMysql.ejecutarQuery(query);
        } catch (DAOExseption ex) {
            System.out.println("error en :"+ex.getLocalizedMessage());
        } catch (SQLException ex) {
            System.out.println("error en :"+ex.getLocalizedMessage());
        }
    }
    
    public void ObtenerListaUsuarios() {
        user = new UsuarioMysql(conn);
        try {
            ArrayList<Usuario> lista = user.ObtenerTodo();
            lista.forEach((object) -> {
                System.out.println(object.toString());
            });
        } catch (DAOExseption ex) {
            System.out.println("error en la consulta a la base de datos "+ex.getMessage());
        }
    }
    
    public void BuscarUsuario(Integer dato){
        user = new UsuarioMysql(conn);
        try {
            System.out.println(user.Obtener(dato));
        } catch (Exception e) {
            System.out.println("erroe en la coneccion buscar usuario"+e.getMessage());
        }
    }
    
    public void AdicionarUsuario(Usuario u){
        user = new UsuarioMysql(conn);
        try {
            user.Adicionar(u);
            System.out.println("adicionado corectamente");
        } catch (Exception e) {
            System.out.println("error al adicionar usuario");
        }
    }
    
    public void EditarUsuario(Usuario u){
        user = new UsuarioMysql(conn);
        try {
            user.Modificar(u);
            System.out.println("dato modificado");
        } catch (Exception e) {
            System.out.println("error al editar un usuario");
        }
    }
    
    public void EliminarUsuario(Usuario us){
        user = new UsuarioMysql(conn);
        try {
            user.Eliminar(us);
            System.out.println("se a liminado corectamente");
        } catch (Exception e) {
            System.out.println("error al eliminar un usuario");
        }
    }
    
    public Usuario EjecutarMiConsulta(String campo,String datoABuscar) {
        try {
            user = new UsuarioMysql(conn);
            return user.DatoBusqueda("select * from usuario where "+campo+" =?", datoABuscar);
        } catch (DAOExseption ex) {
            System.out.println("error en la ejecucion de datos! "+ex.getMessage());
        }
        return null;
    }
    
    public Usuario EjecutarMiConsulta(String campo,int datoABuscar) {
        try {
            user = new UsuarioMysql(conn);
            return user.DatoBusqueda("select * from usuario where "+campo+" =?", datoABuscar);
        } catch (DAOExseption ex) {
            System.out.println("error en la ejecucion de datos! "+ex.getMessage());
        }
        return null;
    }
    
    public void CerrarBD(){
        user.Close();
    }
    
}
