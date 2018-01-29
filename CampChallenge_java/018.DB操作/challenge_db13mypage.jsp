<%-- 
    Document   : challenge_db13mypage
    Created on : 2018/01/26, 13:11:03
    Author     : shochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./test13_2" method="post">
            <input type="submit" value="logout">
        </form>
        <form action="./test13_4" method="post">
            item name
            <input type="text" name="item_name"><br>
            item price
            <input type="text" name="item_price"><br>
            <br>
            <input type="submit" value="item add">
            <br>
        </form>
    </body>
</html>
