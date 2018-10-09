<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/style.css"/>
        <script src="js/script.js"></script>
        <title>App1</title>
        <body>
            <h1>Pagina inicial!!</h1>
        </body>
        <form action="app" method="post">
            <input type="text" name="user" id="idText"/>
            <p><input type="password" name="pass" id="IdPass"/></p>
            <input type="submit" name="sub" value="Entrar"/>
        </form> 
    <p><input type="button" name="button1" value="Click me" id="idButton" onclick="saludar()"/></p>
    </head>
    
</html>
