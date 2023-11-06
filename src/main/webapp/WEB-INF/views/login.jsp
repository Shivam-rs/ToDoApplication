<html>
<head>
    <title>Spring MVC</title>
</head>
<body>
<p style="color: red"> ${errorMessage}</p>
<form action="/spring-mvc/login" method="post">
   Enter User Name <input type="text" name="name"/>
   Password  <input type="password" name="password"/>
    <input type="submit" value="Login"/>
</form>
</body>
</html>