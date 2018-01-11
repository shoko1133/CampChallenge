<%-- 
    Document   : challenge1_5
    Created on : 2017/10/29, 15:11:08
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
int num = 3;


if (num == 1) {
    out.print("1です！");
} 

else if (num == 2){
    out.print("プログラムキャンプ！");
}
else {
    out.print("その他です！");
}


%>
        
        
    </body>
</html>
