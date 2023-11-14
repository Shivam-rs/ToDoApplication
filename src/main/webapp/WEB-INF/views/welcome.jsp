<%--
  Created by IntelliJ IDEA.
  User: crikf
  Date: 11/1/2023
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<title>Welcome</title>
            <body>
                <div class="container">
                    <form method="get">
                        Welcome ${userID} <BR/>
                        <BR/>
                        Now you can check your todos from <a href="/list-todos"/> here
                </div>
<%@ include file="common/footer.jspf"%>