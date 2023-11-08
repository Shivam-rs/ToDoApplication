<%--
  Created by IntelliJ IDEA.
  User: crikf
  Date: 11/1/2023
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Welcome</title>
    </head>
    <body>
    <form action ="/login" method="get">
        Welcome ${userID} <BR/>
        <BR/>
        Now you can check your todos from <a href="/list-todos"> here </a>
    </body>
</html>>
