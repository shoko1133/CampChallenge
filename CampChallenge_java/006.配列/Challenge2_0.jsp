<%-- 
    Document   : Challenge2_0
    Created on : 2017/11/04, 13:55:48
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
        <%@ page import="java.util.ArrayList" %>
        <%
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array.add(new String("soeda"));
        array.add(new String("hayashi"));
        array.add(new String("END"));
        array2.add(new Integer("10"));
        array2.add(new Integer("100"));
        array2.add(new Integer("-20"));
        array2.add(new Integer("118"));
        
        
        
        out.print(array2.get(0));
        out.print(array2.get(1));
        out.print(array.get(0));
        out.print(array.get(1));
        
        out.print(array2.get(2));
        out.print(array2.get(3));
        out.print(array.get(2));
           


        %>
    </body>
</html>
