
package com.ListaPrincipal;

import com.ListaPrincipal.DAO.DAOExseption;
import com.ListaPrincipal.Mysql.UsuarioMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Moderador {
    DBConfig config = null;
    UsuarioMysql user = null;
    Connection conn = null;
    
    public void Path(String path){   
        try {
            config = new DBConfig(path);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?autoReconnect=true&useSSL=false",config.getUser(),config.getPassword());
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
