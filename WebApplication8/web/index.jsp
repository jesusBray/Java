<%-- 
    Document   : index
    Created on : Oct 4, 2018, 2:30:17 AM
    Author     : jesusbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/style1.css">
        <script src="js/script.js"></script>
        <title>App1</title>
    </head>
    <body>
        <h1>Bienvenido a su pagina central!</h1>
        <div class="div1">
            <form action="PaginaInicial" method="post">
                <input type="text" name="user" id="idUser"/>
                <p><input type="password" name="pass" id="idPass"/></p>
                <input type="submit" name="entranda" value="Ingresar"/>
            </form>
        </div>
        <div>
            <p><input type="button" name="button" id="idButon" value="Click me!" onclick="anuncio1()"/></p>
        </div>
            
    </body>
</html>
