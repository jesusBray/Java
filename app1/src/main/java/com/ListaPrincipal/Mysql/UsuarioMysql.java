
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
    private Connection coneccion ;
    PreparedStatement stat = null ; 
    ResultSet resul = null;
    Usuario user= null;
    
    final String INSERT = "INSERT INTO usuario(id_user, nombre, apellido, edad, telefono) VALUES(?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE usuario SET id_user= ? , nombre= ?, apellido= ?, edad= ?, telefono= ? WHERE id_user = ?";
    final String DELETE = "DELETE FROM usuario WHERE id_user = ?";
    final String GETALL = "SELECT * FROM usuario";
    final String GETONE = "SELECT * FROM usuario WHERE id_user= ?";
    
    public UsuarioMysql(Connection c) {
        this.coneccion = c;

    }
    
    public ResultSet ejecutarQuery(String query) throws DAOExseption {
        stat = null;
        resul = null;
        try{
            coneccion.setAutoCommit(false);
            stat = coneccion.prepareStatement(query);
            if (stat.executeUpdate()==0) {
                System.out.println("no se a establesido la solida consulta");
            }
        }catch(SQLException ex){
            try {
                coneccion.rollback();
            } catch (SQLException ex1) {
                System.out.println("a fallado en el ");
            }
            System.out.println(""+ex.getMessage());
            throw new DAOExseption("errror en : ", ex);
        }finally{
            if (resul!= null) {
                try {
                    resul.close();
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
        return resul;
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
        lista = null;
        lista = new ArrayList<Usuario>();
        stat = null;
        resul = null;
        try{
            stat = coneccion.prepareStatement(GETALL);
            resul = stat.executeQuery();
            while (resul.next()) {                
                lista.add(Convertir(resul));
            }
            return lista;
        }catch(SQLException ex) {
            throw new DAOExseption("errror en obtener todo: ",ex);
        } finally {
            CerrarMetodos(stat, resul);
        }
    }

    @Override
    public Usuario Obtener(Integer id) throws DAOExseption {
        stat = null;
        resul = null;
        user  = null;
        try{
            stat = coneccion.prepareStatement(GETONE);
            stat.setInt(1, id);
            resul = stat.executeQuery();
            if (resul.next()) {
               user = Convertir(resul);
            }else{
                System.out.println("no se a encontrado ese registro ");
            }
        }catch(SQLException ex) {
            throw new DAOExseption("errror en obtener : ",ex);
        } finally {
            CerrarMetodos(stat, resul);
        }
        return user;
    }
    
    public void CerrarMetodos(PreparedStatement prep, ResultSet result) {
        if (resul!= null&& result!= null) {
            try {
                    prep.close();
                    result.close();
                } catch (Exception e) {
                    System.out.println("error en: "+e.getMessage());
                }
        }
    }
    
    public Usuario Convertir(ResultSet res) throws SQLException {
        return new Usuario(res.getInt("id_user"),res.getString("nombre"),res.getString("apellido"),res.getInt("edad"),res.getInt("telefono"));
    }
    
    public Usuario DatoBusqueda(String query, String busqueda)throws DAOExseption {
        
        user = null;
        stat = null;
        resul = null;
        
//        establecer coneccion con la base de datos
        stat = getQuery(coneccion, query);
        
//        ejecutar el query con datos
        getPrepared(stat, busqueda);
        
//        obtener los datos ejecutados
        resul = getResultado(stat);
        try {
            if (resul.next()) {
               return user = Convertir(resul);
            }else{
                System.out.println("no se a encontrado ese registro ");
            }
        } catch (SQLException e) {
            throw new DAOExseption("errro en la ejecucion a la base de datos! ",e);
        } finally {
            CerrarMetodos(stat, resul);
        }
        return null;
    }
    
    public Usuario DatoBusqueda(String query, int busqueda)throws DAOExseption {
        
        user = null;
        stat = null;
        resul = null;
        
//        establecer coneccion con la base de datos
        stat = getQuery(coneccion, query);
        
//        ejecutar el query con datos
        getPrepared(stat, busqueda);
        
//        obtener resultados de consulta
        resul = getResultado(stat);
        try {
//          la condicional pregunta si hay algo para emviar de ser lo contrario no envia nada            
            if (resul.next()) {
               return user = Convertir(resul);
            }else{
                System.out.println("no se a encontrado ese registro ");
            }
        } catch (SQLException e) {
            throw new DAOExseption("errro en la ejecucion a la base de datos! ",e);
        } finally {
            CerrarMetodos(stat, resul);
        }
        return null;
    }
    
    public ResultSet getResultado(PreparedStatement prep)throws DAOExseption {        
        try {
            return prep.executeQuery();
        } catch (Exception e) {
            throw new DAOExseption("error en getResultado",e);
        }
    }
    
    public PreparedStatement getQuery(Connection con, String query) throws DAOExseption {
        try {
            return con.prepareStatement(query);
        } catch (Exception e) {
            throw new DAOExseption("error en getQuery! ",e);
        }
    }
    
    public void getPrepared(PreparedStatement prep, String datoBuscar) throws DAOExseption {
        try {
          prep.setString(1, datoBuscar);
        } catch (Exception e) {
            throw new DAOExseption("error en preparedStatement",e);
        }
        
    }
    
    public void getPrepared(PreparedStatement prep, int query) throws DAOExseption {
        try {
            prep.setInt(1, query);
        } catch (Exception e) {
            throw new DAOExseption("error en preparedStatement",e);
        }
    }
    
    public void Close() {
        try {
            coneccion.close();
        } catch (SQLException ex) {
            System.out.println("error en el ciere a la base de datos! "+ex.getMessage());
        }
    }
    
}
