<%-- 
    Document   : results
    Created on : Oct 27, 2015, 8:37:29 PM
    Author     : Jonathan Chiou
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interest Calculator</title>
    </head>
    <body>
        <h1>Interest Calculator Results</h1>
        
        <a href="InterestCalculatorServlet">Redo Calculations</a>
            <div class="container">
           <c:forEach var="result" items="${results}">
            <br/>   
            <c:out value="${result}" />          
            <br />
        </c:forEach>
            </div>
  
    </body>
</html>
