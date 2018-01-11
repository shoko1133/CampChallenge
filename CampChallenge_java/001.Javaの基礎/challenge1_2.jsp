<%-- 
    Document   : challenge1_2
    Created on : 2017/10/29, 12:04:46
    Author     : shochan
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int age=20;
            String name="ひがしだ";
            String s = String.valueOf(age+5);
            
            String[] array={"こんにちは",name+"しょうこです",s+"歳です"};
            List<String> list=Arrays.asList(array);
            
            for (String str : list) {
                out.println(str);
                out.println("<br>");    
            } 
        %>
    </body>
</html>
