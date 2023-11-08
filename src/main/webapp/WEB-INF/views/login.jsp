<html>
    <head>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
              rel="stylesheet">
        <title>Spring MVC Project</title>
    </head>
    <body>
        <div class="container">
            <p style="color: red"> ${errorMessage}</p>
            <form action="/login" method="post">
                <fieldset class="form-group">
                    <label>Enter User Name: </label>
                    <input type="text" name="name" class="form-control"/>
                </fieldset>

                <fieldset class="form-group">
                    <label>Password: </label>
                    <input type="password" name="password" class="form-control"/>
                </fieldset>
                <input type="submit" value="Login" class="btn btn-success"/>
            </form>
        </div>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    </body>
</html>