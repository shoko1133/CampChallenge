<%-- 
    Document   : challenge_db8
    Created on : 2018/01/24, 13:18:31
    Author     : shochan
--%>

<%

//HttpSession hs = request.getSession();
//String n =(String) hs.getAttribute("aName");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        
        <form action="./challenge_db121" method="post">
            <!-- formタグで括られた入力項目はこれら -->
            name&nbsp;&nbsp;&thinsp;&nbsp;&thinsp;&thinsp;
            <input type="text" name="txtName1"><br>
            age&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&thinsp;&thinsp;
            <input type="text" name="txtName2"><br>
            birthday&thinsp;
            <input type="text" name="txtName3"><br>
            <br>
            
            <input type="submit" name="btnSubmit"></form>

        
    </body>
</html>
