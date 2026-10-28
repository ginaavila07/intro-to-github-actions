<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Calculator</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" crossorigin="anonymous"></script>
    <script src="/resources/js/calculator.js"></script>

    <style>
        body {
            background: url('/resources/images/blueone.jpg') no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading"><strong class="">Let's Calculate</strong>

                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action = "/calculate" method = "GET">
                        <div class="form-group">
                            <label for="operator" class="col-sm-3 control-label">Operation</label>
                            <div class="col-sm-9">
                                <select id="operator" name="operation"  class="form-control">
                                    <option value="" selected>Choose operation you want to perform</option>
                                    <option value="1">Add</option>
                                    <option value="2">Subtract</option>
                                    <option value="3">Multiply</option>
                                    <option value="4">Divide</option>
                                    <option value="5">Fibonnaci</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="firstNumber" class="col-sm-3 control-label">First Number</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="firstNumber"  name="firstNumber" required>
                            </div>
                        </div>
                        <div class="form-group secondNumber">
                            <label for="secondNumber" class="col-sm-3 control-label">Second Number</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  id="secondNumber" name="secondNumber" required>
                            </div>
                        </div>
                        <input type = "submit" value = "Submit" />
                    </form>
                </div>
                <div class="panel-footer">
                    <div id="result">${result}</div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>


