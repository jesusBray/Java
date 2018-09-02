package com.ListaPrincipal.getClass;

import com.ListaPrincipal.ClassUsings.Usuario;
import com.ListaPrincipal.DAO.DAOExseption;
import com.ListaPrincipal.DAO.GetUsuarioDAO;
import com.ListaPrincipal.DBConfig;
import com.ListaPrincipal.Mysql.UsuarioMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;

public class getUsuario implements GetUsuarioDAO{
    
    private UsuarioMysql user = null;
    private Connection conn = null;
    
    
    @Override
    public void GetAdd(Usuario a)  {
       user = new UsuarioMysql(conn);
        try {
            user.Adicionar(a);
            System.out.println("adicionado corectamente");
        } catch (Exception e) {
            System.out.println("error al adicionar usuario");
        }
    }

    @Override
    public void GetDelete(Usuario a) {
        user = new UsuarioMysql(conn);
        try {
            user.Eliminar(a);
            System.out.println("se a liminado corectamente");
        } catch (Exception e) {
            System.out.println("error al eliminar un usuario");
        }
    }

    @Override
    public void GetEdit(Usuario a) {
        user = new UsuarioMysql(conn);
        try {
            user.Modificar(a);
            System.out.println("dato modificado");
        } catch (Exception e) {
            System.out.println("error al editar un usuario");
        }
    }

    @Override
    public ArrayList GetAll(){
        user = new UsuarioMysql(conn);
        try {
            return user.ObtenerTodo();
        } catch (DAOExseption ex) {
            System.out.println("error en la consulta a la base de datos "+ex.getMessage());
        }
        return null;
    }
    
    @Override
    public Usuario GetOne(Integer id) {
        user = new UsuarioMysql(conn);
        try {
            return user.Obtener(id);
        } catch (Exception e) {
            System.out.println("erroe en la coneccion buscar usuario"+e.getMessage());
        }
        return null;
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
    
    public void CerrarBD() {
        try {
            user.Close();
            conn.close();   
        } catch (Exception e) {
            System.out.println("error en CerrarBD! ");
        }
    }
}
