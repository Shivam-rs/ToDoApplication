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
    <title>Add A ToDO</title>
</head>
<body>
<form action="/add-todo" method="post">
    Enter Description of ToDo <input type="text" name="desc"/>
    <input type="submit" value="Add"/>
</form>
</body>
</html>
