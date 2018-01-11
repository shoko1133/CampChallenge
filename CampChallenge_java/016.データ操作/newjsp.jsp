<%-- 
    Document   : newjsp
    Created on : 2017/12/17, 13:03:25
    Author     : shochan
--%>



<%
// 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");
// テキストボックスの情報
out.print(request.getParameter("txtName"));
// チェックボックスの情報
out.print(request.getParameter("chkTest"));
// ラジオボタンの情報
out.print(request.getParameter("rdoSample"));

// コンボボックス（select）の情報
out.print(request.getParameter("cmbList"));

// ボタンの情報
out.print(request.getParameter("btnTest"));


%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <form action="./newjsp.jsp" method="post">
      <!-- formタグで括られた入力項目はこれら -->
      
      <input type="text" name="txtName">
      <input type="radio" name="rdoSample">
      男性
      <input type="radio" name="rdoSample">
      女性
       <textarea name="mulText"></textarea>
       <input type="submit" name="btnSubmit">
    </form>
        
        
        <h1>Hello World!</h1>
    </body>
</html>
