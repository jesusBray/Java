<%-- 
    Document   : index
    Created on : Oct 4, 2018, 11:12:23 PM
    Author     : jesusbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/Style.css"/>
        <script src="js/Script.js"></script>
        <title>App</title>
    </head>
    <body>
        <h1>Bienvenido a su pagina principal !!!!!</h1>
        
        <form action="pag1" method="post">
            <input type="text" name="text1" id="idText"/>
            <p><input type="password" name="pass" id="idPass"/></p>
            <input type="submit" name="sub1" value="Click here"/>
        </form>
        
        <form action="pag2" method="post">
            <p><input type="button" value="Boton" onclick="entranda()"/></p>
        </form>
    </body>
</html>
