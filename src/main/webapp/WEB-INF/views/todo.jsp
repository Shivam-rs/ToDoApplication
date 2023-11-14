<%--
  Created by IntelliJ IDEA.
  User: crikf
  Date: 11/8/2023
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
        <title>Add A ToDo</title>
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
<%@ include file="common/footer.jspf"%>