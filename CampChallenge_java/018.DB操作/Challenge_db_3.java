
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */
public class Challenge_db_3 extends HttpServlet {

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
     //String sql = "SELECT * FROM profiles"; 
    
    
    
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
            out.print("接続しました"+"<br>");
            }
         
            
             PreparedStatement db_st = null;
            
            //更新する(30歳の人がいたら37歳に更新)
            db_st=db_con.prepareStatement("UPDATE profiles set age=30 where age=37");
             int num= db_st.executeUpdate();
           

            db_st=db_con.prepareStatement("select*from profiles");
           

            //preparedStatementに必要な設定をおこなったらSQLを実行します。
            ResultSet db_data=null;
            //preraredStatementのexecuteQueryメソッドを実行します。
            db_data=db_st.executeQuery();
            //ResultsetからSQLの実行結果を取り出し表示します。
            //netxメソッドでデータの有無を確認しwhile文でデータがある限り取得し続ける。
            while(db_data.next()){
            //メソッドは１行のデータからカラムの情報を受け取っています。
            out.print(db_data.getInt("profilesId")+" | "+db_data.getString("name")+" | "+db_data.getString("tel")+" | "+db_data.getInt("age")+" | "+db_data.getString("birthday")+"<br>");
            
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
