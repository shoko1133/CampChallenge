/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shochan
 */
public class challenge_db131 {
  public static boolean validate(String name,String password){  
  boolean status = false;
  try {
    Connection db_con = null;
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "GEEKJOB", "1234");
    PreparedStatement db_st = null;
    db_st = db_con.prepareStatement("SELECT * FROM user WHERE name = ? AND password = ?");
    db_st.setString(1,name);
    db_st.setString(2,password);
    
    ResultSet db_data = null;
    db_data = db_st.executeQuery();
    
    status = db_data.next(); 
    
    db_con.close();
  } catch (Exception e){System.out.println(e);
  }
    return status;
  }
  public static void AddItem(String item_name, int item_price){
   try {
    Connection db_con = null;
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "GEEKJOB", "1234");
    PreparedStatement db_st = null;
    db_st = db_con.prepareStatement("INSERT INTO item (item_name, price) values (?,?)");
    db_st.setString(1,item_name);
    db_st.setInt(2,item_price);
 
    db_st.executeUpdate();
    db_con.close();
  } catch (Exception e){System.out.println(e);
  } 
    return;
  } 
  public static ArrayList<String> GetItem(){
   ArrayList<String> items = new ArrayList<String>();
   try {
    Connection db_con = null;
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "GEEKJOB", "1234");
    PreparedStatement db_st = null;
    db_st = db_con.prepareStatement("SELECT * FROM item");
    ResultSet db_data = null;
    db_data = db_st.executeQuery();
    
    while (db_data.next()) {
        items.add(new String(db_data.getString("item_name")));
    }
    db_con.close();
  } catch (Exception e){System.out.println(e);
  } 
    return items;
  } 
}
