
package com.ListaPrincipal.Mysql;

import com.ListaPrincipal.DAO.DAOExseption;
import com.ListaPrincipal.DAO.UsuarioDAO;
import com.ListaPrincipal.ClassUsings.Usuario;
import com.ListaPrincipal.getClass.getUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioMysql implements UsuarioDAO {
    
    private ArrayList<Usuario> lista = new ArrayList<>();
    private Connection coneccion = null;
    private PreparedStatement stat ; 
    private ResultSet resul = null;
    private Usuario user= null;
    
    private final String INSERT = "INSERT INTO usuario(id_user, nombre, apellido, edad, telefono) VALUES(?, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE usuario SET id_user= ? , nombre= ?, apellido= ?, edad= ?, telefono= ? WHERE id_user = ?";
    private final String DELETE = "DELETE FROM usuario WHERE id_user = ?";
    private final String GETALL = "SELECT * FROM usuario";
    private final String GETONE = "SELECT * FROM usuario WHERE id_user= ?";
    private String campo,datoDeBusqueda = null,queries;
    private int datoDeBusquedaInt;
    private ResultSetMetaData resultMeta = null;
    
    
    //constructor que pide por parametro a la coneccion con mysql envio por parametro!
    public UsuarioMysql(Connection c) {
        this.coneccion = c;
    }

    public ResultSetMetaData getResultMeta() {
        return resultMeta;
    }

    public void setResultMeta(ResultSetMetaData resultMeta) {
        this.resultMeta = resultMeta;
    }

    public ResultSet getResul() {
        return resul;
    }

    public void setResul(ResultSet resul) {
        this.resul = resul;
    }

    public PreparedStatement getStat() {
        return stat;
    }

    public void setStat(PreparedStatement stat) {
        this.stat = stat;
    }
    
    public UsuarioMysql() { }

    public Connection getConeccion() {
        return coneccion;
    }

    public void setConeccion(Connection coneccion) {
        this.coneccion = coneccion;
    }

    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
    
    
    public int getDatoDeBusquedaInt() {
        return datoDeBusquedaInt;
    }

    public void setDatoDeBusquedaInt(int datoDeBusquedaInt) {
        this.datoDeBusquedaInt = datoDeBusquedaInt;
    }

    public String getQueries() {
        return queries;
    }

    public void setQueries(String queries) {
        this.queries = queries;
    }

    public String getTabla() {
        return campo;
    }

    public void setTabla(String tabla) {
        this.campo = tabla;
    }

    public String getDatoDeBusqueda() {
        return datoDeBusqueda;
    }

    public void setDatoDeBusqueda(String datoDeBusqueda) {
        this.datoDeBusqueda = datoDeBusqueda;
    }
    
    //-------------------sets and gets------------

    //error metodo inestrable!
    public void inicializaDB(String dbName) throws SQLException{
        PreparedStatement stat = null;
        PreparedStatement stat2 = null;
        PreparedStatement stat3 = null;
        resul = null;
        coneccion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        try{
            coneccion.setAutoCommit(false);
            stat = coneccion.prepareStatement("CREATE DATABASE IF NOT EXISTS usuario");
            stat2 = coneccion.prepareStatement("use usuario");
            stat3 = coneccion.prepareStatement("create table usuario (id_usuario int(255) not null auto_increment primary key, nombre varchar(100), apellido varchar(100));");
            if (stat.executeUpdate() != 0) {
                stat.executeUpdate();
                stat2.executeUpdate();
                stat3.executeUpdate();
                coneccion.commit();
            }
            System.out.println("datos balidos para la base de datos");
        }catch(SQLException e){
            System.out.println("error en ejecutarQuery");
            if (coneccion != null) {
                    coneccion.rollback();
                }    
        } finally {
            
        }
    }
    
    //metodo en pruevas (warning!!)
    public void ejecutarQuery(String query ) throws DAOExseption {
        stat = null;
        resul = null;
        try{
            coneccion.setAutoCommit(false);
            stat = coneccion.prepareStatement(query);
            System.out.println("creado corectamente");
            if (stat.executeUpdate()>0){
                    System.out.println("creado corectamente");
                    coneccion.commit();
            }else
                coneccion.rollback();
        }catch(SQLException ex) {
            try {
                if (stat.executeUpdate()>0)
                    System.out.println("creado corectamente");
                else
                    coneccion.rollback();
            } catch (SQLException e) {
                System.out.println("a fallado en el "+e.getMessage());
                
            }
            System.out.println(""+ex.getMessage());
            throw new DAOExseption("errror en : ", ex);
        }finally{
            
        }
    }  
    
    @Override
    public void Adicionar(Usuario adicionar) throws DAOExseption {
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
        } finally {
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ex){
                    throw new DAOExseption("error en sql");
                }
            }
        }
    }
    
    public void Eliminar(int eliminar) throws DAOExseption {
        new Usuario(eliminar).setId_user(eliminar);
        stat= null;
        try {
            stat = coneccion.prepareStatement(DELETE);
            stat.setInt(1, user.getId_user());
            if (stat.executeUpdate()== 0) {
                throw new DAOExseption("no se a guardado los datos");
            }
        } catch (SQLException ex) {
            throw new DAOExseption("error en la eliminacion de datos ",ex);
        } finally {
            
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
        } finally {
            
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
            stat.setInt(6, dato1.getId_user());
            
            if (stat.executeUpdate()== 0 ) {
                throw new DAOExseption("no se a guardado los datos");
            }
        } catch (SQLException ex) {
            throw new DAOExseption("error en la modificasion ",ex);
        } finally {
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ex) {
                    throw new DAOExseption("error en sql");
                }
            }
        }
    }

    @Override
    public ArrayList ObtenerTodo() throws DAOExseption {
        lista = null;
        stat = null;
        resul = null;
        try{
            lista = new ArrayList<>();
            stat = coneccion.prepareStatement(GETALL);
            resul = stat.executeQuery();
            while (resul.next()) {                
                lista.add(Convertir(resul));
            }
            return lista;
        }catch(SQLException ex) {
            throw new DAOExseption("errror en obtener todo: ",ex);
        } finally {
            CerrarMetodos(getStat(), getResul(), getConeccion());
        }
    }

    @Override
    public ArrayList<Usuario> Obtener(Integer id) throws DAOExseption {
        
        stat = null;
        resul = null;
        user  = null;
        lista = null;
        lista = new ArrayList<>();
        try{
            stat = coneccion.prepareStatement(GETONE);
            stat.setInt(1, id);
            resul = stat.executeQuery();
            if (resul.next()) 
               lista.add(Convertir(resul));
            else 
                System.out.println("no se a encontrado ese registro ");
        }catch(SQLException ex) {
            throw new DAOExseption("errror en obtener : ",ex);
        } finally {
            CerrarMetodos(stat, resul, coneccion);
        }
        return lista;
    }
    
    public String QueriesDeBusqueda(){
        return "select * from usuario where "+this.campo+" =? ";
    }
    
    public String QueriesDeBusquedaInt(){
        return "select * from usuario where "+this.campo+"= ? ";
    }
    
    public Usuario Convertir(ResultSet res) throws SQLException {
        return new Usuario(
                res.getInt("id_user"),
                res.getString("nombre"),
                res.getString("apellido"),
                res.getInt("edad"),
                res.getInt("telefono")
        );
    }
    
    public ArrayList<Usuario> rrecorerLista(ArrayList<Usuario> lista, ResultSet resultado){
        try {         
            while (resultado.next()) {
                lista.add(Convertir(resultado));
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("error en recorecor lista "+ex.getMessage());
        }
        return null;
    }
    
    public ArrayList<Usuario> DatoBusquedaCadena()throws DAOExseption {    
        try{
            setStat(getQueries((coneccion),QueriesDeBusqueda()));
            getPrepared(getStat());
            setResul(getResultado(getStat()));
            return rrecorerLista(getLista(), getResul());
        }catch(Exception ex) {
            System.out.println("error en datoBusquedaCadena: "+ex.getMessage());
            throw new DAOExseption("error en obtener : ",ex);
        } finally {
            CerrarMetodos(getStat(), getResul(), getConeccion());
        }
    }  
    
    public ArrayList<Usuario> DatoBusquedaInt()throws DAOExseption {
        try{
            setStat(getQueries((coneccion),QueriesDeBusqueda()));
            getPreparedInt(getStat());
            setResul(getResultado(getStat()));
            return rrecorerLista(getLista(), getResul());
        }catch(Exception ex) {
            System.out.println("error en datoBusquedaInt: "+ex.getMessage());
            throw new DAOExseption("error en obtener : ",ex);
        } finally {
            CerrarMetodos(getStat(), getResul(), getConeccion());
        }
    } 
    
    public ResultSet getResultado(PreparedStatement prep)throws DAOExseption {
        try {
            return prep.executeQuery();
        } catch (Exception e) {
            throw new DAOExseption("error en getResultado",e);
        }
    }
    
    public void getResultadoUpdate(PreparedStatement prep){
        try {
            prep.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error en getRResultadoUpdate: "+ex.getMessage());
        }
    }
    
    public PreparedStatement getQueries(Connection con,String queries) throws DAOExseption {
        try {
            return con.prepareStatement(queries);
        } catch (Exception e) {
            throw new DAOExseption("error en getQuery! ",e);
        }
    }

    public void getPrepared(PreparedStatement prep) throws DAOExseption {
        try {
          prep.setString(1, getDatoDeBusqueda());
        } catch (Exception e) {
            throw new DAOExseption("error en preparedStatement",e);
        }
    }
    
    public void getPreparedInt(PreparedStatement prep) throws DAOExseption {
        try {
            prep.setInt(1, getDatoDeBusquedaInt());
        } catch (Exception e) {
            throw new DAOExseption("error en preparedStatement",e);
        }
    }
    
    public ResultSetMetaData getResultSetMetadata(ResultSet resultSet,ResultSetMetaData resultSetMetadata){
        try {
            return resultSetMetadata = resultSet.getMetaData();
        } catch (SQLException ex) {
            System.out.println("error en "+ex.getMessage());
        } return null;
    }
    
    public String[] listarEtiquetas(ResultSetMetaData resultSetMetadata) {
        String etiquetas[]= null;
        try {
            etiquetas= new String[resultSetMetadata.getColumnCount()];
            for (int i = 0; i < resultSetMetadata.getColumnCount(); i++) {
                etiquetas[i]=resultSetMetadata.getColumnName(i+1);
            }
            return etiquetas;
        } catch (Exception e) {
            System.out.println(" error en las etiquetas: "+e.getLocalizedMessage());
        } return etiquetas;
    }

    public void CerrarMetodos(PreparedStatement prep, ResultSet result,Connection con) {
        if (prep != null && result != null && con != null) {
            try {
                con.close();
                prep.close();
                result.close();
            } catch (Exception e) {
                System.out.println("error en: "+e.getMessage());
            }
        }
    }
    
    
}
