<%-- 
    Document   : soinsubunkai
    Created on : 2018/01/12, 11:26:54
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
        out.print(request.getParameter("num"));
        out.print("を素因数分解します<br>");
        //numをintに変換。
        String numStr = request.getParameter("num");
        int num = Integer.parseInt(numStr);
        
       //numを素因数分解する。
       
       int i=2;
       while(num!=1){
           if(num%i==0){
                num=num/i;
                out.println("素因数");
                out.println(i);
                out.print("<br>");
           }
           else if(num!=0){
               out.println("余りは"+num);
               break;
           }
           else{
           i++;
           }
        }
       
        %>
    
       
    </body>
</html>
