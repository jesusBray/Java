/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app5.com.servlets;

import app5.com.clases.Cliente;
import app5.com.clases.ModeloClientes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ControladorProductos extends HttpServlet {
    private static final long serialVercionUID = 1L;
    private ModeloClientes modCli;
    @Resource(name="jdbc/coneccion")
    private DataSource mipool;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    public void init()throws ServletException{
        super.init();
        try {
            modCli = new ModeloClientes(mipool);
            System.out.println("coneccion estable");
        } catch (Exception e) {
            throw new ServletException("Error en el metodo init: "+e.getMessage());
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Cliente>lista;
        try {
            lista = modCli.listaCliente();
            request.setAttribute("LISTAPRODUCTOS", lista);
            RequestDispatcher requestDis = request.getRequestDispatcher("newJsp.jsp");
            requestDis.forward(request, response);
        } catch (Exception e) {
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
