
package app8.com.servlets;

import app8.com.clases.GetLogin;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class servletLoger extends HttpServlet {

    GetLogin loger;
    @Resource(name="jdbc/coneccion")
    private DataSource poolConect;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
     
    }

    @Override
    public void init() throws ServletException {
        super.init(); 
        try {
            loger = new GetLogin(poolConect);
        } catch (Exception  e) {
            System.out.println("error en el metodo init: "+e.getMessage());
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request, response);
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        System.out.println(user+", "+pass);
        if (loger.logear(user, pass)) {
            RequestDispatcher requestDis = request.getRequestDispatcher("ManagerGrids");
            requestDis.forward(request, response);
        }
        else{
            response.sendRedirect("index.html");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
