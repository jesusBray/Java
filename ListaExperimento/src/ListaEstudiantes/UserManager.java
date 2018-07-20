package ListaEstudiantes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserManager {
    ConectionSql conn;
    Statement declaración = null;
    PreparedStatement miSentencia = null;
    ResultSet resultado = null;
    private String lCargo="Cargo: ",lNombre=" Nombre: ",lApellido=" Apellido: ",lSueldo=" Sueldo: ",buscarApp;
    
    public UserManager(ConectionSql c) {
        this.conn = c;
    }
    
    public UserManager(String buscarApp) {
        this.buscarApp = buscarApp;
    }
    
    public PreparedStatement ConnectedQuery(String consulta){
        if (conn.isConnected()) {
            try {
                conn.Connect();
                return  miSentencia = conn.Connect().prepareStatement(consulta);
            } catch (Exception e) {
                System.out.println("Error en la consulta!");
            }
        }
        else{
            System.out.println("no se pudo crear coneccion, error! ");
        }
        return miSentencia; 
    }
    
    public ResultSet PreparedStatementQuery(){
        try {
            ConnectedQuery("select cargo, nombre, apellido, sueldo from dato_empleado where apellido=?");
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
            System.out.println("Erroe en la coneccion..."+e.getMessage());
        }
    }
    
    public void ShowUsers(){
        try {
            conn.Connect();
            ConnectWithAllUsers();
            ExecuteConnectionQuery();
            while(resultado.next()){
                String cargo = resultado.getString(1);
                String nombre = resultado.getString(2);
                String apellido = resultado.getString(3);
                String sueldo = resultado.getString(4);
                System.out.println("Cargo: "+cargo+"         Nombre: "+nombre+"        Apellido: "+apellido+"       Sueldo: "+sueldo);
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
    
    public ResultSet ExecuteConnectionQuery() {
        try {
            ConnectWithAllUsers();
            return resultado = ConnectWithAllUsers().executeQuery("select cargo, nombre, apellido, sueldo from dato_empleado");
        } catch (Exception e) {
            System.out.println("Error en las consultas."+e.getMessage());
        }
        return resultado;
    }
    
    public void Conectadoparamostrar() {
        if(conn.isConnected()){
            try {
                declaración = conn.Connect().createStatement();
            } catch (Exception e) {
                System.out.println("error en la coneccion metodo mostrar"+e.getMessage());
            }
        }
    }
    
    public void CreaEmpleado (String id_usuario, String cargo, String nombre, String apellido, int sueldo) {
        // verificando si esta conectado realmente ademas se le a;ada el llenado de campo mediante consultas sql;
    
        //myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO","root","root");
        // 2 preparar la consulta
        //ResultSet result = stmt.executeQuery("select * from usuarios");
        //PreparedStatement miSentencia = myConnection.prepareStatement("SELECT cargo, nombre, apellido, sueldo FROM dato_empleado WHERE nombre=?");
        
        // 3 estables parametros de la consulta
//        miSentencia.setString(1, id_usuario);
//        miSentencia.setString(2, cargo);
//        miSentencia.setString(3, nombre);
//        miSentencia.setString(4, apellido);
//        miSentencia.setInt(5, sueldo);
//        ResultSet resultado = miSentenci
//                a.executeQuery();
//        while (resultado.next()) {
//            System.out.println(cargo+resultado.getString(1)+nombre+resultado.getString(2)+apellido+resultado.getString(3)+sueldo+resultado.getInt(4));
//        }
//        resultado.close();
    }
    
    public void AddUser() {
        
        
        
        
    } 
    
    
    
    
    
}
