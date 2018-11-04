<%-- 
    Document   : formAdicionar
    Created on : Oct 19, 2018, 10:21:52 AM
    Author     : jesusbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario!</title>
    </head>
    <body>
        <h1>Adicionar usuario!!</h1>
        <form action="Usuario" method="post">
            <input type="hidden" name="instruccion" value="insertarBBDD"/>
            <input type="text" name="nombre" placeholder="nombre"/>
            <p><input type="text" name="apellido" placeholder="apellido"/></p>
            <p><input type="text" name="edad" placeholder="edad"/></p>
        </form>
        <form action="#" method="post">
            <input type="submit" value="Enviar" name="sub"/>
        </form>
        
        <div>
            <input type="button" name="Atras" onclick="window.location.href='paginas/PagUser.jsp'"/>
            
        </div>
        
        
    </body>
</html>
