<%-- 
    Document   : Challnge2_5
    Created on : 2017/11/04, 15:54:32
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
          int sum=0;
          for (int i=1; i<100;i++){
            sum+=i;
        }
          out.print(sum);
        %>
    </body>
</html>
