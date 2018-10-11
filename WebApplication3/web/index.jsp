
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/Style.css"/>
        <script src="js/script.js"></script>
        <title>App1</title>
    </head>
    <body>
        <h1>Bienvenidos a la pagina inicial</h1>
        <div>
            <form action="#" method="post">
                <input type="text" name="textUser" id="idUser"/>
                <p><input type="password" name="pass" id="idPass"/></p>
                <p><input type="submit" id="submit" name="entrada" value="Entrar"/></p>
            </form>
        </div>
        <input type="button" value="Click me" onclick="saludar()"/>
        <form action="Pag1" method="post">
            
        </form> 
    </body>
</html>
