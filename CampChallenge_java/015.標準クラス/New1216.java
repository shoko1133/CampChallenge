/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//日付編課題１

public class New1216 {
    public static void main (String[]args){
   
        // カレンダーインスタンスの作成
        Calendar c = Calendar.getInstance();
        
        c.set(2016, 0, 1, 0, 0,0);
        
        System.out.println(c.getTime());
        System.out.print(c.getTime().getTime());
    }
}
