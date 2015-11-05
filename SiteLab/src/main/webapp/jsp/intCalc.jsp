<%-- 
    Document   : intCalc
    Created on : Oct 23, 2015, 4:03:30 PM
    Author     : Jonathan Chiou
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index Page</title>
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
                    <li role="presentation" >
                        <a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/luckyEntry">Lucky Sevens</a></li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/intCalc">Interest Calculator</a></li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/tipEntry">Tip Calculator</a></li>
                </ul>    
            </div>

            <div class="container col-md-12">
          
                <form class="form-horizontal" action='InterestCalculatorServlet' method='POST'>
                    <fieldset>

                        <!-- Form Name -->
                        <legend>Let's calculate something INTERESTING!</legend>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="annIntRate">Annual Interest Rate</label>  
                            <div class="col-md-4">
                                <input id="annIntRate" name="annIntRate" type="text" placeholder="EX: enter 5 for 5%" class="form-control input-md">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="principal">Principal</label>  
                            <div class="col-md-4">
                                <input id="principal" name="principal" type="text" placeholder="100" class="form-control input-md">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="years">Years</label>  
                            <div class="col-md-4">
                                <input id="years" name="years" type="text" placeholder="10" class="form-control input-md">

                            </div>
                        </div>

                        <!-- Button -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="button"></label>
                            <div class="col-md-4">
                                <button id="button" name="button" class="btn btn-primary">Calculate!</button>
                            </div>
                        </div>

                    </fieldset>
                </form>


            </div>

        </div>
    </body>
</html>
