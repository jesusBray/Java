package app5.com.servlets;

//java.io ==> terceros pero fundamentales, throws e impreciones de informacion
import java.io.IOException;
import java.io.PrintWriter;
//java.sql ==> conecciones a la base de datos (sql)
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//javax.sql datasource ==> esta clase hace referencia a (context.xml)
import javax.sql.DataSource;
//javax.annotation ==> esta clase crea el path asia el documento (context.xml)
import javax.annotation.Resource;
//javax.servlet ==> estas clases son fundamentales para el scafolding de un archivo (doc.servlet)
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    //establecer el dataSource
    @Resource(name = "jdbc/coneccion")
    private DataSource miPool;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        out.println("Servlet1 funcionando!");
        try {
            Connection con = miPool.getConnection();
            
            System.out.println("Todo bien!");
        } catch (SQLException e) {
            System.out.println("error en doGet: "+e.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
