/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shochan
 */
public class challenge_db extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     Connection db_con = null;
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
             
            //Class.forNameメソッドを利用し、libフォルダにあるmaysql用のjdbcドライバのインスタンス生成。
            //このインスタンスは生成と同時にDriverManagerにセットされます。
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            //DriverManagerのgetConnectionメソッドでDBへの接続を取得します。
            //connecttion変数=DriverManager.getConnection("接続文字列","アカウント名","パスワード");
            //接続文字列(jdbc: + データベースへの種類 + :// + 接続先　+　: + ポート番号 + / +　データベース名);
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "GEEKJOB", "1234");
            
            if(db_con!=null){
            out.print("接続しました");
            }
            
            //ファイルをクローズする。
            db_con.close();
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge_db</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge_db at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
         catch (SQLException ex) {
             
             System.out.print(ex.getMessage());
             
             
            Logger.getLogger(jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            
            System.out.print(ex.getMessage());

            Logger.getLogger(jdbc.class.getName()).log(Level.SEVERE, null, ex);
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
