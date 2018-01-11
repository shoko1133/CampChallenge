<%-- 
    Document   : challenge1_3
    Created on : 2017/10/29, 13:39:18
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
            final int BASE=10;
            int num=2;
            
            out.print("10+2=");
            out.print(BASE+num);
            out.print("<br>");
            out.print("10-2=");
            out.print(BASE-num);
            out.print("<br>10×2=");
            out.print(BASE*num);
            out.print("<br>10÷2=");
            out.print(BASE/num);
          
            
            
            out.print("<br>1+2=");
            num++;
            out.print(num);
            



            %>
        
    </body>
</html>
