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

//日付編課題２年月日時間を表示

public class New1213 {
    public static void main( String [] args){
      Date now = new Date();
      
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.print(sdf.format(now));
    }
}
