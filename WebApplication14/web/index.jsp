<%-- 
    Document   : index
    Created on : Oct 6, 2018, 9:20:40 PM
    Author     : jesusbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>App</title>
    </head>
    <body>
        <h1>App!!</h1>
        <form action="Pag1" method="post">
            <input type="text" name="user" id="idText"/>
            <p><input type="password" name="pass" id="IdPass"/></p>
            <input type="submit" name="sub" value="Entranr" onclick="metodo1()"/>
        </form>    
    </body>
</html>
