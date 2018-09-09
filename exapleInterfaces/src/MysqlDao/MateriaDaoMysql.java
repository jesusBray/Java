package MysqlDao;

import Colegio.usuario;
import exapleinterfaces.DAO.materiaDAO;
import java.util.ArrayList;
import java.sql.*;

public class MateriaDaoMysql implements materiaDAO{
    
    private final String UPDATE = "update usuario set nombre= ? where id_usuario= ? ";
    private final String INSERT = "insert into";
    Connection conection;
    
    @Override
    public void adicionarDatod(usuario adicionar) {
       
    }

    @Override
    public void eliminardatos(usuario eliminar) {
        
    }

    @Override
    public void modificar(usuario dato1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList Listar(usuario datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public usuario obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
