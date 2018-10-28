
package app6.com.servlets;

import app6.com.clases.Login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ServletLista extends HttpServlet {
    
    private static final long serialVercionUID = 1L;
    @Resource(name="jdbc/data1")
    public DataSource conPool;
    public Login login;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
    }

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            login = new Login(conPool);
        } catch (Exception e) {
            System.out.println("error en init al intentar conectarse con el pool de conecciones: "+e.getMessage());
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
        try(PrintWriter out = response.getWriter();){
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            out.println(user+", "+pass);
        }catch(Exception e){
            System.out.println("error en doPost: "+e.getMessage());
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
