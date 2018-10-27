package app4.servlets;

import app4.clases.ConeccionSql;
import app4.clases.ConfigProperties;
import app4.clases.Validation;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        Validation va = new Validation();
        PrintWriter imprimDato = response.getWriter();
        System.out.println(user+", "+pass);
        ConeccionSql c = new ConeccionSql();
        ConfigProperties con = new ConfigProperties("config.properties");
        imprimDato.println(con.getDatosDB("userDB"));
        imprimDato.println(c.getUserDB());
        String datoProperties = c.dataBase+", "+c.extra+", "+c.pass+", "+", "+c.port+", "+c.server+", "+c.user;
        imprimDato.println(datoProperties);
        imprimDato.println(user+", "+pass);
        imprimDato.println();
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
