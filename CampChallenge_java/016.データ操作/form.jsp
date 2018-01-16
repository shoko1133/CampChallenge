<%-- 
    Document   : form
    Created on : 2018/01/16, 14:15:40
    Author     : shochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

HttpSession hs = request.getSession();
String n =(String) hs.getAttribute("aName");
String t = (String) hs.getAttribute("aText");
String r = (String) session.getAttribute("rdoSample");

String a="";
if(r.equals("男性")){a="checked";}
String b="";
if(r.equals("女性")){b="checked";}
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="prof" method="post">
            <!-- formタグで括られた入力項目はこれら -->
            名前
            <input type="text" name="txtName" value=<% if(n != null){out.print(n);}%>>
            <br>
            <input type="radio" name="rdoSample" value="男性" <%=a%>>
            男性
            <input type="radio" name="rdoSample" value="女性"<%=b%>>
            女性
            <br>
            趣味
            <textarea name="mulText" ><% if(t != null){out.print(t);}%></textarea>
            <br>
            <input type="submit" name="btnSubmit"></form>

    </body>
</html>
