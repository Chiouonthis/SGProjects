<%-- 
    Document   : tipOutput
    Created on : Oct 27, 2015, 9:44:51 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tip Calculator 9000: The Tippening</title>
        <link rel="stylesheet" href="/css/bootstrap.min.css">
        <link rel="shortcut icon" href="img/icon.png">
    </head>
    <body>
        <h1>Tip Calculation Complete!</h1>

        <div class="container">
        ${initialBillString}
        <br/>
        ${tipString}
        <br/>
        ${totalBillString}
        <br/>
        <br/>
        <a href="TipCalcServlet">Click to calculate another tip</a>
        </div>
        <script src="/js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
