package app5.com.clases;
//gotcha
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;

public class ModeloClientes {
    
    private DataSource conPool;

    public ModeloClientes(DataSource conPool) {
        this.conPool = conPool;
    }
    
    public ArrayList<Cliente> listaCliente() throws Exception{
        String queri = "select * from datosCliente";
        ArrayList<Cliente> lista = new ArrayList<>();
        Connection con = conPool.getConnection();
        Statement stat = con.createStatement();
        ResultSet result = stat.executeQuery(queri);
        while (result.next()) {            
            lista.add(new Cliente(result.getInt("id"), result.getString("nombre"), result.getString("apellido"),result.getInt("edad")));
        }
        return lista;
    }
    
    
}
