<%-- 
    Document   : challenge_db13
    Created on : 2018/01/24, 13:18:31
    Author     : shochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--ログイン画面-->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./test13" method="post">
            <!-- formタグで括られた入力項目はこれら -->
            Name: <input type="text" name="name"><br>
            Password: <input type="text" name="password"><br>
            <input type="submit" value="login">
        </form>
    </body>
</html>
