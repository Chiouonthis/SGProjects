<%-- 
    Document   : tipEntry
    Created on : Oct 27, 2015, 9:08:53 PM
    Author     : apprentice
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
                    <li role="presentation" >
                        <a href="${pageContext.request.contextPath}/luckyEntry">Lucky Sevens</a></li>
                    <li role="presentation" >
                        <a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/intCalc">Interest Calculator</a></li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/tipEntry">Tip Calculator</a></li>
                </ul>    
            </div>


            <form class="form-horizontal" action='TipCalcServlet' method='POST' >
                <fieldset>

                    <!-- Form Name -->
                    <legend>Welcome to Tip Calculator 9000</legend>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="initialBill">Bill</label>  
                        <div class="col-md-4">
                            <input id="initialBill" name="initialBill" type="text" placeholder="124.50" class="form-control input-md">

                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="tipPercentage">Tip Percentage</label>  
                        <div class="col-md-4">
                            <input id="tipPercentage" name="tipPercentage" type="text" placeholder="EX: enter 10 for 10%" class="form-control input-md">

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

        <script src="/js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>
