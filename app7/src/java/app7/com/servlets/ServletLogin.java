
package app7.com.servlets;

import app7.com.clases.GetLogin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ServletLogin extends HttpServlet {
    
    @Resource(name="jdbc/coneccion")
    private DataSource conPool;
    private GetLogin login;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            login = new GetLogin(conPool);
        } catch (Exception e) {
            System.out.println("error en el metodo Init: "+e.getMessage());
        }
    }
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
        try{
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            if (login.validacionUsuario(user, pass)) {
                response.sendRedirect("usuario.jsp");
            }
            else{
                response.sendRedirect("index.html");
            }
        }catch(Exception e){
            System.out.println("error en doPost: "+e.getMessage());
        }
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
