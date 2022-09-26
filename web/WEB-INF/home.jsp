<%-- 
    Document   : home
    Created on : 26-Sep-2022, 5:25:39 PM
    Author     : pandawr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <form action="home" method="post">
            <h2>Hello ${username}.</h2>
            <a herf="login">Log in</a>
        </form>
    </body>
</html>
