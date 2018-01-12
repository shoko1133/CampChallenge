<%-- 
    Document   : receive
    Created on : 2018/01/11, 17:43:36
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
            out.print("総額は¥");
            out.print(request.getParameter("total"));
            out.println("<br>");
            

            // 変数に代入してその値を使いまわしたい時
            // getParameter は 必ず String 型の値となる
            String totalStr = request.getParameter("total");

            // Integer.parseInt は、文字列の数字を int 型の数値に変換する機能
            // "123"（イチニイサン） -> 123 ということ
            int total = Integer.parseInt(totalStr);
        
            //out.println(total);
            //out.println("<br>");
            out.print("個数");
            out.println(request.getParameter("count"));
            out.println("<br>");
            out.print("タイプ");
            out.println(request.getParameter("type"));
            out.println("<br>");
            
            
            //type2を生鮮食品と表示させる。
            out.println("商品種別は");
            int type=Integer.parseInt(request.getParameter("type"));
                if(type==2){
                    out.print("生鮮食品");
                    out.println("<br>");
                }       
            
            //受け取った総額と個数から、１個当たりの値段を算出し、表示する。
            //1500÷10
            int count=Integer.parseInt(request.getParameter("count"));
            out.print("１個あたりの金額は¥");
            out.println(total/count);
            out.println("<br>");
            
            //総額に応じたポイントが付きます。ポイントを計算し、表示してください。
            
            out.print("獲得ポイント");
            //3000円〜5000円のお買い上げで4%のポイント獲得。
            double total_d=Double.parseDouble(request.getParameter("total"));
                if(total>=3000&&total<=5000){
                    out.println(total_d=total_d*0.04);
                }
            
            //5000円以上のお買い上げで5%のポイント獲得。
            else if(total>=5000){
                out.println(total_d=total_d*0.05);
            }
            
            //3000円以下でポイント獲得なし。
            else{
            out.print("なし");
            }
            
        
        
        %>
        
    </body>
</html>
