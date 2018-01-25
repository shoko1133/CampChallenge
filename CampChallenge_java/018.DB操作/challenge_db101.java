/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shochan
 */
public class challenge_db101 extends HttpServlet {

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
            
            request.setCharacterEncoding("UTF-8");
            
            Connection db_con = null;
            
            
            //Class.forNameメソッドを利用し、libフォルダにあるmaysql用のjdbcドライバのインスタンス生成。
            //このインスタンスは生成と同時にDriverManagerにセットされます。
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            //DriverManagerのgetConnectionメソッドでDBへの接続を取得します。
            //connecttion変数=DriverManager.getConnection("接続文字列","アカウント名","パスワード");
            //接続文字列(jdbc: + データベースへの種類 + :// + 接続先　+　: + ポート番号 + / +　データベース名);
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "GEEKJOB", "1234");
            
            if(db_con!=null){
                out.print("接続しました"+"<br>");
            }
            
            //型変換
            int id= Integer.parseInt(request.getParameter("txtName"));
            
         
            PreparedStatement db_st = null;
             
            //削除する
            db_st = db_con.prepareStatement("delete from profiles where profilesId=?");
            db_st.setInt(1, id);
            
            int num = db_st.executeUpdate();
          
            db_st = db_con.prepareStatement("select * from profiles");
            
            //preparedStatementに必要な設定をおこなったらSQLを実行します。
            ResultSet db_data=null;
            //preraredStatementのexecuteQueryメソッドを実行します。
            db_data = db_st.executeQuery();
            //ResultsetからSQLの実行結果を取り出し表示します。
            
            while(db_data.next())
               {out.print(db_data.getInt("profilesId")+" | "+db_data.getString("name")+" | "+db_data.getString("tel")+" | "+db_data.getInt("age")+" | "+db_data.getDate("birthday")+"<br>");
            }
            
            //ファイルをクローズする。
            db_con.close();
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Challenge_db801</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Challenge_db801 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
           } catch (ClassNotFoundException ex) {
          Logger.getLogger(Challenge_db801.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
            Logger.getLogger(Challenge_db801.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
              Logger.getLogger(Challenge_db801.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
            Logger.getLogger(Challenge_db801.class.getName()).log(Level.SEVERE, null, ex);
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
