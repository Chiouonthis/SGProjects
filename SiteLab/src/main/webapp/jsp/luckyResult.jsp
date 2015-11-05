<%-- 
    Document   : luckyResult
    Created on : Oct 27, 2015, 8:22:46 PM
    Author     : Jonathan Chiou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lucky Sevens</title>
    </head>
    <body>
        <h1>Lucky Sevens!</h1>
        
        
                ${message}
                <br/>
            
                ${endGameMessage}

                <h2>GAME OVER</h2>
                
                <a href="LuckySevensServlet">Play again</a>
                
    </body>
</html>
