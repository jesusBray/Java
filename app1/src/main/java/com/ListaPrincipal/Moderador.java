
package com.ListaPrincipal;

import com.ListaPrincipal.DAO.DAOExseption;
import com.ListaPrincipal.Mysql.UsuarioMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;

public class Moderador {
    DBConfig config = null;
    UsuarioMysql user = null;
    Connection conn = null;
    
    public void DBConnect(){
        //String userDir = System.getProperty("user.dir");
        //String propPath = MessageFormat.format("{0}/MyDBConfig.properties", userDir);
        config = new DBConfig("./Config/dbconfig.properties");
        String server = config.getServer();
        String port = config.getPort();
        String db = config.getBaseDato();
        String user = config.getUser();
        String pass = config.getPassword();
        try {
            String stringDriver = MessageFormat.format("jdbc:mysql://{0}:{1}/{2}?autoReconnect=true&useSSL=false", server, port, db);
            System.out.println(stringDriver);
            //conn = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+db+"?autoReconnect=true&useSSL=false",user,pass);
            conn = DriverManager.getConnection(stringDriver, user, pass);
        } catch (SQLException ex) {
            System.out.println("error en :"+ex.getLocalizedMessage());
        }
    }
    
    public void Path(String path) {
        try {
            config = new DBConfig(path);
            String server = config.getServer();
            String port = config.getPort();
            String db = config.getBaseDato();
            String user = config.getUser().toString();
            String pass = config.getPassword().toString();
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?autoReconnect=true&useSSL=false",config.getUser(),config.getPassword());
            conn = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+db+"?autoReconnect=true&useSSL=false",user,pass);
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
    
    public void CerrarBD(){
        user.Close();
    }
    
}
