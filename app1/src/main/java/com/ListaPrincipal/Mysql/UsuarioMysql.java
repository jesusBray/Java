
package com.ListaPrincipal.Mysql;

import com.ListaPrincipal.DAO.DAOExseption;
import com.ListaPrincipal.DAO.UsuarioDAO;
import com.ListaPrincipal.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioMysql implements UsuarioDAO{
    
    ArrayList<Usuario> lista;
    private Connection coneccion = null;
    PreparedStatement stat; 
    
    final String INSERT = "INSERT INTO usuario(id_user, nombre, apellido, edad, telefono) VALUES(?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE usuario SET id_user= ? , nombre= ?, apellido= ?, edad= ?, telefono= ? WHERE id_user = ?";
    final String DELETE = "DELETE FROM usuario WHERE id_user = ?";
    final String GETALL = "SELECT * FROM usuario";
    final String GETONE = "SELECT * FROM usuario WHERE id_user= ?";
    
    public UsuarioMysql(Connection c) {
        this.coneccion = c;

    }
    
    @Override
    public void Adicionar(Usuario adicionar) throws DAOExseption{
        stat = null;
        try {
            stat = coneccion.prepareStatement(INSERT);
            stat.setInt(1, adicionar.getId_user());
            stat.setString(2, adicionar.getNombre());
            stat.setString(3, adicionar.getApelldio());
            stat.setInt(4, adicionar.getEdad());
            stat.setInt(5, adicionar.getTelefono());
            if (stat.executeUpdate()==0 ) {
                throw new DAOExseption("no se a guardado los datos");
            }
        } catch (SQLException ex) {
            throw new DAOExseption("errro en la insercion de datos! ",ex);
        }finally{
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ex){
                    throw new DAOExseption("error en sql");
                }
            }
        }
        
    }

    public Usuario Convertir(ResultSet res) throws SQLException{
        return new Usuario(res.getInt("id_user"),res.getString("nombre"),res.getString("apellido"),res.getInt("edad"),res.getInt("telefono"));
    }
    
    @Override
    public void Eliminar(Usuario eliminar) throws DAOExseption {
        stat= null;
        try {
            stat = coneccion.prepareStatement(DELETE);
            stat.setInt(1, eliminar.getId_user());
            if (stat.executeUpdate()== 0) {
                throw new DAOExseption("no se a guardado los datos");
            }
        } catch (SQLException ex) {
            throw new DAOExseption("error en la eliminacion de datos ",ex);
        }finally{
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ex){
                    throw new DAOExseption("error en sql");
                }
            }
        }
        
    }

    @Override
    public void Modificar(Usuario dato1) throws DAOExseption {
        stat= null;
        try {
            stat = coneccion.prepareStatement(UPDATE);
            stat.setInt(1, dato1.getId_user());
            stat.setString(2, dato1.getNombre());
            stat.setString(3, dato1.getApelldio());
            stat.setInt(4, dato1.getEdad());
            stat.setInt(5, dato1.getTelefono());
            stat.setInt(6, dato1.getId_busqueda());
            if (stat.executeUpdate()== 0 ) {
                throw new DAOExseption("no se a guardado los datos");
            }
        } catch (SQLException ex) {
            throw new DAOExseption("error en la modificasion ",ex);
        }finally{
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ex){
                    throw new DAOExseption("error en sql");
                }
            }
        }
    }

    @Override
    public ArrayList ObtenerTodo() throws DAOExseption {
        ArrayList<Usuario> lista = new ArrayList<>();
        PreparedStatement stat = null;
        ResultSet res= null;
        try{
            stat = coneccion.prepareStatement(GETALL);
            res = stat.executeQuery();
            while (res.next()) {                
                lista.add(Convertir(res));
            }
        }catch(SQLException ex){
            throw new DAOExseption("errror en : ",ex);
        }finally{
            if (res!= null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("error en: "+e.getMessage());
                }
            }
            if (stat!= null) {
                try {
                    stat.close();
                } catch (Exception e) {
                    System.out.println("error en: "+e.getMessage());
                }
            }
        }
        return lista;
    }

    @Override
    public Usuario Obtener(Integer id) throws DAOExseption{
        stat = null;
        ResultSet res = null;
        Usuario user  = null;
        try{
            stat = coneccion.prepareStatement(GETONE);
            stat.setInt(1, id);
            res = stat.executeQuery();
            if (res.next()) {
               user = Convertir(res);
            }else{
                System.out.println("no se a encontrado ese registro ");
            }
        }catch(SQLException ex){
            throw new DAOExseption("errror en : ",ex);
        }finally{
            if (res!= null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("error en: "+e.getMessage());
                }
            }
            if (stat!= null) {
                try {
                    stat.close();
                } catch (Exception e) {
                    System.out.println("error en: "+e.getMessage());
                }
            }
        }
        return user;
    }
 
    public void Close(){
        try {
            coneccion.close();
        } catch (SQLException ex) {
            System.out.println("error en el ciere a la base de datos! "+ex.getMessage());
        }
    }
    
}
