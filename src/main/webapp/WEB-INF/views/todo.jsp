<%--
  Created by IntelliJ IDEA.
  User: crikf
  Date: 11/8/2023
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
              rel="stylesheet">
        <title>Add A ToDo</title>
    </head>
    <body>
        <div class="container">
            <form:form method="post" commandName="toDo">
                <fieldset class="form-group">
                    <form:label path="desc">Enter Description of ToDo </form:label>
                    <form:input path="desc" type="text" class="form-control" required="required" />
                    <form:errors path="desc" cssClass="text-warning" />
                </fieldset>

                <fieldset class="form-group">
                    <form:label path="targetDate">Enter Target Date for this ToDo </form:label>
                    <form:input path="targetDate" type="text" class="form-control" required="required" />
                    <form:errors path="targetDate" cssClass="text-warning" />
                </fieldset>
                <input type="submit" value="Submit" class="btn btn-success"/>
            </form:form>
        </div>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    </body>
</html>