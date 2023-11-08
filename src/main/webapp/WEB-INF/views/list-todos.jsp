<%--
  Created by IntelliJ IDEA.
  User: crikf
  Date: 11/6/2023
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <title>ToDo's for ${userID}</title>
</head>
<body>
    <div class="container">
        <table class="table table-striped table-bordered">
            <caption>${userID}, your To-Do's are</caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Date</th>
                    <th>Completed</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach items="${toDos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.desc}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td><a class="btn btn-danger" href="delete-todo?id=${todo.id}">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div>
            <a class="btn btn-success" href="/add-todo"> Add </a>
        </div>

    </div>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
      rel="stylesheet">
</body>
</html>
