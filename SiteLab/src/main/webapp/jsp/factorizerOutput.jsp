<%-- 
    Document   : factorizerOutput
    Created on : Oct 27, 2015, 9:10:49 PM
    Author     : Jonathan Chiou
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorizer</title>
    </head>
    <body>
        <h1>Factorizer Results</h1>
        
         ${message} <br />
                
                <c:forEach var='factor' items='${factorList}'>
                    <c:out value="${factor.value}" />
                </c:forEach>
                <br/>
                ${primeMessage}<br />
                ${perfectMessage}<br />
                
                <a href="FactorizerServlet">Click here to factorize another number</a>
    </body>
</html>
