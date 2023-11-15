<%--
  Created by IntelliJ IDEA.
  User: crikf
  Date: 11/6/2023
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>

        <%@ include file="common/header.jspf"%>
        <%@ include file="common/navigation.jspf"%>
        <title>ToDo's for ${userID}</title>

    <body>
        <div class="container">
            <table class="table table-striped table-bordered">
                <caption>${userID}, your To-Do's are</caption>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Description</th>
                        <th>Date</th>
                        <th>Is Completed?</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${toDos}" var="todo">
                        <tr>
                           <%-- <td><fmt:formatNumber</td>--%>
                            <td>${todo.id}</td>
                            <td>${todo.desc}</td>

                            <td> <fmt:formatDate pattern="MM/dd/yyyy" value="${todo.targetDate}"/></td>
                            <td>${todo.done}</td>
                            <td>
                                <a class="btn btn-info" href="update-todo?id=${todo.id}">Update</a>
                                <a class="btn btn-danger" href="delete-todo?id=${todo.id}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div>
                <a class="btn btn-success" href="/add-todo"> Add </a>
            </div>
        </div>

        <%@ include file="common/footer.jspf"%>

