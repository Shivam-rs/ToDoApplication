<%--
  Created by IntelliJ IDEA.
  User: crikf
  Date: 11/8/2023
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <title>Add A ToDo</title>
</head>
<body>
<div class="container">
    <form action="/add-todo" method="post">
        <fieldset class="form-group">
            <label>Enter Description of ToDo </label> <input type="text" name="desc" class="form-control" required="required"/>
        </fieldset>
        <input type="submit" value="Add" class="btn btn-success"/>
    </form>
</div>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</body>
</html>