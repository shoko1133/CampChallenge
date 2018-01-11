<%-- 
    Document   : challenge1_6
    Created on : 2017/10/29, 15:52:34
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
        int num=2;
        switch(num){
            case 1:
        out.print("one");
        break;
        case 2:
        out.print("two");
        break;
        default:
            out.print("その他");
        }
        
        %>
    </body>
</html>
