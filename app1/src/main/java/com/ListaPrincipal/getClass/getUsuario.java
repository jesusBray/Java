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
import java.util.Arrays;

public class getUsuario implements GetUsuarioDAO{
    
    private Connection conn = null; 
    private UsuarioMysql user= null;
    
    public getUsuario() {
    }

    public Connection getConn() {
        return conn;
    }

    public final void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public UsuarioMysql getUser() {
        return user;
    }

    public void setUser(UsuarioMysql user) {
        this.user = user;
    }
  
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
    
    public void GetDelete(int a) {
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
    public ArrayList<Usuario> GetOne(Integer id) {
        user = new UsuarioMysql(conn);
        try {
            return user.Obtener(id);
        } catch (Exception e) {
            System.out.println("erroe en la coneccion buscar usuario"+e.getMessage());
        }
        return null;
    }
    
    public void DBConnect() {
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
    
    //metodo inestable warning!!
    public void createDB(){
        UsuarioMysql usuarioMysql = new UsuarioMysql(conn);
        try {
            usuarioMysql.ejecutarQuery("");
        } catch (DAOExseption ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            System.out.println("error en createDB");
        }
    }
    
    public ArrayList<Usuario> EjecutarMiConsultaBusqueda(String campo, String datoABuscar) {
        user = new UsuarioMysql(conn);
        try {
            user.setTabla(campo);
            user.setDatoDeBusqueda(datoABuscar);
            return user.DatoBusquedaCadena();
        } catch (Exception ex) {
            System.out.println("error en la ejecucion de datos! "+ex.getMessage());
        }
        return null;
    }

    public ArrayList<Usuario> EjecutarMiConsultaBusqueda(String campo,int datoABuscar) {
        try {
            user = new UsuarioMysql(conn);
            user.setTabla(campo);
            user.setDatoDeBusquedaInt(datoABuscar);
            return user.DatoBusquedaInt();
        } catch (DAOExseption ex) {
            System.out.println("error en la ejecucion de datos! "+ex.getMessage());
        }
        return null;
    }
    
    public String[] getNameColumns(String tabla){
        user = new UsuarioMysql(conn);
        try {
            user.setStat(user.getQueries(conn, tabla));
            user.setResul(user.getResultado(user.getStat()));
            user.setResultMeta(user.getResultSetMetadata(user.getResul(), user.getResultMeta()));
            return user.listarEtiquetas(user.getResultMeta());
        } catch (DAOExseption ex) {
            System.out.println("error en getNameColumns: "+ex.getMessage());
        }
        return null;
    }

}
