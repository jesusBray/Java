package app8.com.servlets;

import app8.com.clases.Empleados;
import app8.com.clases.GestorEmpleados;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ServletGetDB extends HttpServlet {

    @Resource(name="jdbc/coneccion")
    private DataSource poolConect;
    GestorEmpleados obtenerEmpleados;
    //pruevas unitarias en donde necesariamente deben de hacerse en metodos para demostrar su funcionavilidad correcta
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //primero es leer el parametro del formulario
        String elComando= request.getParameter("instruccion");
        //si no se envia el parametro, listar productos, condicionales!
        if(elComando==null) elComando="listar";
        //redirigir el flujo de ejecucion al metodo adecuado
        switch(elComando){
            case "lista":
                obtenerEmpleados(request, response);
                break;
            case "insertarBBDD":
                agregarEmpleado(request, response);
                break;
            default:
                obtenerEmpleados(request, response);
                
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private void obtenerEmpleados(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {
            //instancia la lista de Empleados
            obtenerEmpleados = new GestorEmpleados(poolConect);
            
            //agregar la lista de Empleados al request
            request.setAttribute("LISTAEMPLEADO", obtenerEmpleados.getAllEmpleados());
            
            //enviar ese request a la pagina jsp con un redireccionador
            RequestDispatcher requestDis = request.getRequestDispatcher("paginas/PagUser.jsp");
            requestDis.forward(request, response);
        } catch (IOException e) {
            System.out.println("error en el servlet doPost: "+e.getMessage());
        }
    }

    private void agregarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        //leer la informacion del lista empleado que viaja en el formulario
        //crear un objeto empleado
        Empleados e = new Empleados(Integer.parseInt(request.getParameter("id")), request.getParameter("nombre"), request.getParameter("apellido"), Integer.parseInt(request.getParameter("edad")));
        //enviar el objeto al modelo y despues insertar  el usuario a  la bbdd
        obtenerEmpleados.agregarNuevoEmpleado(e);
        //volver al listado de empleados
        obtenerEmpleados(request, response);
    }

}
