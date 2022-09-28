<%-- 
    Document   : login
    Created on : 26-Sep-2022, 5:18:13 PM
    Author     : pandawr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" name="username" value="${username}" ><br>
            Password: <input type="password" name="password" value="${password}" ><br>
            <button type="submit">Log in</button>
        </form>
            <p>${message}</p>
    </body>
</html>
