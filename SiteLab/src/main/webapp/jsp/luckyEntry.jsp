<%-- 
    Document   : entry
    Created on : Oct 23, 2015, 12:24:11 PM
    Author     : Jonathan Chiou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
       <head>
        <title>Jonathan Chiou's Spring MVC Site Lab</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/css/starter-template.css" rel="stylesheet">
        
        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        
        
        <div class="container">
            <h1>Jonathan Chiou's Spring MVC Site Lab</h1>
            <hr/>
            <div class="navbar">
                 <ul class="nav nav-tabs">
                 <li role="presentation">
                     <a href="${pageContext.request.contextPath}/home">Home</a></li>
                <li role="presentation"  class="active">
                    <a href="${pageContext.request.contextPath}/luckyEntry">Lucky Sevens</a></li>
                <li role="presentation">
                    <a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                <li role="presentation">
                    <a href="${pageContext.request.contextPath}/intCalc">Interest Calculator</a></li>
                <li role="presentation">
                    <a href="${pageContext.request.contextPath}/tipEntry">Tip Calculator</a></li>
                </ul>    
            </div>
       
                <h1>Try Your Luck!</h1>               
                <form action='LuckySevensServlet' method='POST'>
                    
                    How much money do you want to play with?<br/>
                    <input type="text" name="startingFunds">                 
                    <input type="submit" value="Start Playing!">

                </form>

        </div>

    </body>
</html>
