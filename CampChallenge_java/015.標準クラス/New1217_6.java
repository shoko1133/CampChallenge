
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */

//日付編課題３  2016年11月4日 10時0分0秒のタイムスタンプを作成し、「年-月-日 時:分:秒」で表示してください。

public class New1217_6 {
    public static void main( String [] args){
     
        Date now= new Date();
        Calendar c = Calendar.getInstance();
        c.set(2016, 10, 4, 10, 0,0);
        
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
         System.out.println(c.getTime());
       
         System.out.println(c.getTime().getTime());
        
         System.out.print(sdf.format(c.getTime()));
       
        
    }
}
