/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */

//文字列編課題３
//以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える処理を作成し、結果を表示してください。
//「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」


public class New1216_4 {
    
    public static void main(String[]args){
        String a ="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
            System.out.println(a.replace("U", " う"));
            a=a.replace("U","う");
            System.out.print(a.replace("I", " い"));
            
    }
}
