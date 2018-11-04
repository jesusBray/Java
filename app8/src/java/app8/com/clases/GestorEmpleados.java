
package app8.com.clases;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

public class GestorEmpleados {

    private final DataSource con;
    private Statement stat;
    private ResultSet result;
    private ArrayList<Empleados> lista;
    public GestorEmpleados(DataSource con){
        this.con=con;
    }
    
    public ArrayList<Empleados> listadorEmpleados (ResultSet result,ArrayList<Empleados> lista){
        try {
            while (result.next()) {
                lista.add(new Empleados(result.getInt("id"), result.getString("nombre"), result.getString("apellido"), result.getInt("edad")));
            }
        } catch (SQLException ex) {
            System.out.println("error en el lista de usuarios! "+ex.getMessage());
        }
        return lista;
    }
    
    public ArrayList<Empleados> getAllEmpleados(){
        lista = new ArrayList<>();
        try {
            stat = con.getConnection().createStatement();
            result = stat.executeQuery("select * from datosCliente");
            return listadorEmpleados(result, lista);
        } catch (SQLException | NullPointerException e) {
            System.out.println("Error en getEmpleados: "+e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Empleados> getEmpleado(String datoBusqueda){
        lista = new ArrayList<>();
        try {
            stat = con.getConnection().createStatement();
            result = stat.executeQuery("select * from datosCliente where nombre= %"+datoBusqueda+"%");
            return listadorEmpleados(result, lista);
        } catch (SQLException | NullPointerException e) {
            System.out.println("Error en getEmpleado!!! "+e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Empleados> getEmpleado(int datoBusqueda){
        lista = new ArrayList<>();
        try {
            stat = con.getConnection().createStatement();
            result = stat.executeQuery("select * from datosCliente where edad= "+datoBusqueda);
            while(result.next()){
                lista.add(new Empleados(result.getInt("id"), result.getString("nombre"), result.getString("apellido"), result.getInt("edad")));
            }
            return lista;
        } catch (SQLException | NullPointerException e) {
            System.out.println("Error en getEmpleado!!! "+e.getMessage());
            return null;
        }
    }

    public void agregarNuevoEmpleado(Empleados e) {
        //obtener la connection 
        
        //crear la instruccion sql que inserte el producto!
        
        //establcer los parametros para el empleado(inser intu)
        
        //ejecutar la instruccion sql
        
    }
    
    
}
