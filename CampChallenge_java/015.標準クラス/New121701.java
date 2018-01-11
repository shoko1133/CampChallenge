
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

//ファイル操作課題３

    import java.io.*;
    import java.text.SimpleDateFormat;
    import java.util.LinkedList;


public class New121701 {
    

  
    public static void main(String[] args) throws IOException {
        // ファイルオープン
            File fp = new File("test.txt");
                // FileWriter作成
                FileWriter fw = new FileWriter(fp);
        
         Date now = new Date();
      
        // SimpleDateFormat作成
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        fw.write(sdf.format(now)+"開始");
        
        
          LinkedList<String> lk = new LinkedList<String>();  
            lk.add("1");
            lk.add("2");
            lk.add("3");
                System.out.println(lk.get(0));
                System.out.println(lk.get(1));
                System.out.println(lk.get(2));
         
          fw.write(sdf.format(now)+"終了");
        
        // クローズ
        fw.close();
        
        // FileReader作成
        FileReader fr = new FileReader(fp);
            // BufferedReader作成
            BufferedReader br = new BufferedReader(fr);
                // 1行読み出し
                System.out.println(br.readLine());

        br.close();
  
    }
    
    
}

    
