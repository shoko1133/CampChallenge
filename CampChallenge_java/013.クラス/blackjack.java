/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shochan
 */
public class blackjack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet blackjack</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Dealer dealer=new Dealer();
            User user=new User();
            out.print(dealer.cards);
            
            
            out.print("<br>");
            //out.print(dealer.deal());
            out.print("<br>");
            
           
            //out.print(dealer.hit());
            
            out.print("<br>");
            
            dealer.setcard(dealer.deal());
            user.setcard(dealer.deal());
            
            
            if(user.checkSum()==true){
                user.setcard(dealer.hit());
            }
            
            if(dealer.checkSum()==true){
                dealer.setcard(dealer.hit());
            }
            
            
            out.print("ディーラーのカード");
            out.print(dealer.mycard);
            out.print("<br>");
            out.print("あなたのカード");
            out.print(user.mycard);
            out.print("<br>");
            out.print(dealer.open());
            out.print("<br>");
            out.print(user.open());
            
            
            
            
            
            out.print("<br>");
            //userの合計値がdealerより大きい
            if(user.open()> dealer.open()){
                //userの合計値が21を超えていない
                if(user.open()<=21){
                out.print("あなたの勝ちです");
            }
        }
            
            //userの合計値がdealerより大きい
            if(user.open()> dealer.open()){
                //userの合計値が21を超えている,dealerは21超えてない
                if(user.open()>=21 && dealer.open()<=21){
                out.print("あなたの負けです");
            }
        }
            //userの合計値がdealerより小さい
            if(user.open()< dealer.open()){
                //userの合計値が21を超えていない,dealerは21超えている
                if(user.open()<=21 && dealer.open()>=21){
                out.print("あなたの負けです");
            }
        }
            
           
            //userの合計値がdealerより小さい
            if(user.open()< dealer.open()){
                //userの合計値が21を超えていない
                if(user.open()<=21){
                out.print("あなたの負けです");}
                
        }
            if(user.open()==dealer.open()){
            out.print("引き分け");
            }
            
            if(user.open()>21 && dealer.open()>21){
            out.print("引き分け");
            }
            
            
            
            out.println("<h1>Servlet blackjack at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
