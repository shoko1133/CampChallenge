<%-- 
    Document   : Challenge2_6
    Created on : 2017/11/04, 16:23:03
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
        <%
           int i = 1000;
           while (i > 100) {
               i = i / 2;
               out.println(i);
           }
        %>
    </body>
</html>
