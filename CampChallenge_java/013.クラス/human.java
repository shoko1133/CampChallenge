
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */





abstract class human {
abstract public int open();
abstract public void setcard (ArrayList<Integer> setcard);
ArrayList<Integer> mycard= new ArrayList<Integer>();
abstract public boolean checkSum();
}


class  Dealer extends human{
    //初期処理
    ArrayList<Integer> cards = new ArrayList<Integer>();
    public Dealer(){
        //4種類のカードがある。
        for(int i=1 ;i<=4; i++){
            //4種類のカードが１から１３まである。
            for(int j=1; j<=13; j++){
                
                
                if(j>10){
                cards.add(10);
                }
                else{
                    cards.add(j);
                }
            }
        }    
    }

    public ArrayList<Integer> deal(){
        //乱数取得
        Random rand = new Random();
        //新しいArrayListを作る。
        ArrayList<Integer> cards2 =new ArrayList<Integer>();

        //５0から５5行目を２回繰り返す。
        for(int i=0;i<2;i++){
            //５２枚のカードからランダムで選ぶ。
            Integer index=rand.nextInt(cards.size());
              //ランダムで選ばれたカード取得する。
              int num=cards.get(index);
                //ランダムで選ばれたカード（num）が追加される。
                    cards2.add(num);
        }
                        return cards2;
    }



    public ArrayList<Integer> hit(){
        Random rand  = new Random();
        // 新しいArrayListを作る
        ArrayList<Integer>cards3 = new ArrayList<Integer>();
            //52枚のカードからランダムでカードを引く
            Integer index=rand.nextInt(cards.size());
                    //選ばれたカードを取得
                    int num=cards.get(index);
                        //選ばれたカード(num)が追加される。
                        cards3.add(num);
                                return cards3;
    }

    public int open(){
        //合計値
        int total=0;
            //配列なので拡張for文
            for(int value:mycard){
                total=total+value;
        }
                    return total;
    }

    public boolean checkSum(){
        //numは合計値
        int num=open();
            //合計値が17以下
            if (num<=17){return true;}
                else{return false;}
    }

    public void setcard(ArrayList<Integer> setcard){
        //setcardの要素数分繰り返す
        for(int i=0;i<setcard.size();i++){
            //iを取得する
            int num=setcard.get(i);
                //numにはいったカードがmycardへ
                mycard.add(num);
        }
    }
}


class User extends human{
    
    public int open(){
        int total=0;
        for(int value:mycard){
        total=total+value;
        }
        return total;
    }

    public boolean checkSum(){
        int num=open();
        if (num<=17){return true;}
        else{return false;}

    }

    public void setcard(ArrayList<Integer> setcard){
        for(int i=0;i<setcard.size();i++){
            int num=setcard.get(i);
            //numにはいったカードがmycardへ
            mycard.add(num);
        }
    }
}

