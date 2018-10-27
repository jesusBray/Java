
<%@page import="java.util.*, app5.com.clases.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>userADM</title>
    </head>
        <% //listado de datos del dataBase!
            ArrayList<Cliente>listaClientes = (ArrayList<Cliente>)request.getAttribute("LISTAPRODUCTOS");
        %>
    <body>
        <h1>Datos del cliente oficial!</h1>
        <table>
            <tr>
                <td>Nombre: </td>
                <td>Apellido: </td>
                <td>Edad: </td>
            </tr>
            <% for (Cliente c : listaClientes) {%>
                <tr>
                    <td><%= c.getNombre() %></td>
                    <td><%= c.getApellido()%></td>
                    <td><%= c.getEdad()%></td>
                </tr>
            <%} %>
        </table>
    </body>
</html>
