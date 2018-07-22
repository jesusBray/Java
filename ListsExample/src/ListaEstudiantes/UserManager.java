package ListaEstudiantes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserManager {
    ConexionSQL conn;
    Statement declaración = null;
    PreparedStatement miSentencia = null;
    ResultSet resultado = null;
    private String buscarApp;
    Usuario usuario;
    
    public UserManager(String buscarApp) {
        this.buscarApp = buscarApp;
    }
    
    public UserManager(ConexionSQL conn){
        this.conn = conn;
    }
    
    public PreparedStatement ConnectedQueryPrepared(String consulta){
        if (conn.isConnected()) {
            try {
                conn.Connect();
                return  miSentencia = conn.Connect().prepareStatement(consulta);
            } catch (Exception e) {
                System.out.println("Error en la consulta!"+e.getMessage());
            }
        }
        else{
            System.out.println("no se pudo crear coneccion, error! ");
        }
        return miSentencia; 
    }
    
    public ResultSet PreparedStatementQuery(){
        try {
            ConnectedQueryPrepared("select cargo, nombre, apellido, sueldo from dato_empleado where apellido=?");
            miSentencia.setString(1, buscarApp);
            return resultado = miSentencia.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en respuesta Busqueda! "+e.getMessage());
        }
        return resultado;
    }
    
    public void ShowSearchUser(String dato) {
        this.buscarApp = dato;
        try {
            PreparedStatementQuery();
            while (resultado.next()) {            
                System.out.println("Cargo: "+resultado.getString(1)+" Nombre: "+resultado.getString(2)+" Apellido: "+resultado.getString(3)+" Salario"+resultado.getInt(4));
            }
        } catch (Exception e) {
            System.out.println("Error en la coneccion..."+e.getMessage());
        }
    }
    //este metodo uetra todos los usuarios ojo al charque
    public void ShowUsers(){
        try {
            ConnectWithAllUsers();
            ExecuteConnectionQuery("select * from dato_empleado");
            while(resultado.next()){
                String id_usuario = resultado.getString(1);
                String cargo = resultado.getString(2);
                String nombre = resultado.getString(3);
                String apellido = resultado.getString(4);
                String sueldo = resultado.getString(5);
                System.out.println("ID usuario: "+id_usuario+"\t Cargo: "+cargo+"\tNombre: "+nombre+"\tApellido: "+apellido+"\tSueldo: "+sueldo);
            }
        } catch (Exception e) {
            System.out.println("error en mostrar usuarios");
        }
    }
    
    public Statement ConnectWithAllUsers() {
        try {
            conn.Connect();
            return declaración = conn.Connect().createStatement();
        } catch (Exception e) {
            System.out.println("error en el metodo ConnectWithAllUsers()");
        }
        return declaración;
    }
    
    public ResultSet ExecuteConnectionQuery(String query) {
        try {
            ConnectWithAllUsers();
            return resultado = ConnectWithAllUsers().executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en las consultas."+e.getMessage());
        }
        return resultado;
    }
    
    public void AddUser(String id_usuario,String cargo,String nombre,String app,int salario) {
        try {
            ConnectedQueryPrepared("INSERT INTO dato_empleado"
                + " VALUES"
                + "(?,?,?,?,?)");
            miSentencia.setString(1, id_usuario);
            miSentencia.setString(2, cargo);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, app);
            miSentencia.setInt(5, salario);
            miSentencia.executeUpdate();
            System.out.println("usuario guardado con exito");            
        } catch (Exception e) {
            System.out.println("error en la adicion de usuarios"+e.getMessage());
        }
    } 
    
    public int RemoveUser(String deleteUser){
        try {
            ConnectedQueryPrepared("DELETE FROM dato_empleado where id_usuario=?");
            miSentencia.setString(1, deleteUser);
            System.out.println("Eliminado con exito");
            return miSentencia.executeUpdate();
        } catch (Exception e) {
            System.out.println("erroe ne la eliminacion del usuario"+e.getMessage());
        }
        return 0;
    }
    
    
    
}
