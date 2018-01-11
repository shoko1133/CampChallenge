<%-- 
    Document   : Challenge2_3
    Created on : 2017/11/04, 15:28:49
    Author     : shochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
        
        for(int i = 1; i < 20; i++ )
        {
          i=i*8;
          out.print(i); 
        }
    
    %>
    </body>
</html>
