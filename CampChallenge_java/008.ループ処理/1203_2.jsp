<%-- 
    Document   : 1203_2
    Created on : 2017/12/03, 15:58:53
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
        long sum=1;
       for(int i=1;i<20; i++){
       sum =sum*8;
       out.print(sum);
       out.print("<br>");
       }
       

       %>
    </body>
</html>
