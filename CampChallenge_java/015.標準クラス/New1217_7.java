
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */
public class New1217_7 {
     public static void main(String[] args) throws IOException {
        // ファイルオープン
        File fp = new File("test.txt");
        // FileWriter作成
        FileWriter fw = new FileWriter(fp);
        // 書き込み（自己紹介）
        fw.write("東田尚子です。年齢は２５歳です。出身地は広島で、東京都在住です。");
        // クローズ
        fw.close();
     }
}

