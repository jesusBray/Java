<%@page import="java.util.ArrayList, app8.com.clases.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/stylePaginaUsuario.css">
        <title>Usuario ADM</title>
    </head>
    <%
        ArrayList<Empleados>lista = (ArrayList<Empleados>)request.getAttribute("LISTAEMPLEADO");
    %>
    <body>
        <h1>Gestor usuarios disponibles!!</h1>
        <table>
            <tr>
                <td class="etiqueta1">Nombre: </td>
                <td class="etiqueta2">Apellido: </td>
                <td class="etiqueta3">Edad: </td>
            </tr>
            <% for (Empleados c : lista) {%>
                <tr>
                    <td><%= c.getNombre() %></td>
                    <td><%= c.getApellido()%></td>
                    <td><%= c.getEdad()%></td>
                </tr>
            <%} %>
        </table>
        <div>
            <input type="button" value="Adicionar usuario" name="adicionarUsuario" onclick= "window.location.href='paginas/formAdicionar.jsp'"/>
            <input type="button" value="Eliminar usuario" name="eliminarUsuario"/>
            <input type="button" value="Actualizar usuario" name="actualizarUsuario"/>
            <input type="button" value="Buscar usuario" name="buscarUsuario"/>
        </div>
        
        
        
    </body>
</html>
