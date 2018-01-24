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
      
        
        <form action="./Challenge_db901" method="post">
            <!-- formタグで括られた入力項目はこれら -->
            id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&thinsp;&nbsp;&thinsp;&thinsp;
            <input type="text" name="txtName"><br>
            name&nbsp;&nbsp;&thinsp;&nbsp;&thinsp;&thinsp;
            <input type="text" name="txtName2"><br>
            tel&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&emsp;&nbsp;
            <input type="text" name="txtName3"><br>
            age&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&thinsp;&thinsp;
            <input type="text" name="txtName4"><br>
            birthday&thinsp;
            <input type="text" name="txtName5"><br>
            <br>
            
            <input type="submit" name="btnSubmit"></form>

        
    </body>
</html>
