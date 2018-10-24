<%-- 
    Document   : index
    Created on : Oct 4, 2018, 2:14:58 PM
    Author     : jesusbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="div1">
            <form action="Autenticacion" method="post">
                <input type="text" name="user" id="idUser"/>
                <p><input type="password" name="pass" id="idPass"/></p>
                <input type="submit" name="entranda" value="Ingresar"/>
            </form>
        </div>
    </body>
</html>
