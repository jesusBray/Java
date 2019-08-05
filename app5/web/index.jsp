<%-- 
    Document   : index
    Created on : May 20, 2019, 8:14:20 PM
    Author     : jesusbook
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="files_connectionsDB.producto"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
                <h1>Hello World!</h1>
        <%
            List<String> list = (List<String>)request.getAttribute("LISTAPRODUCTOS");
        %>
        <table>
                        <% for (producto c : list) {%>
                <tr>
                    <td><%= c.toString() %></td>
                </tr>
            <%} %>
        </table>
    </body>
</html>
