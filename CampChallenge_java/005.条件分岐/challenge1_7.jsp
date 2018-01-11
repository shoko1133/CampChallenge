<%-- 
    Document   : challenge1_7
    Created on : 2017/10/29, 16:26:55
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
          char a='あ';
          switch(a){
          case 'A':
              out.print("英語");
              break;
          case 'あ':
              out.print("日本語");
              break;
          default:
              out.print("しょうちゃん");
          }
        %>
    </body>
</html>
