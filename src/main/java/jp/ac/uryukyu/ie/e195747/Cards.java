package jp.ac.uryukyu.ie.e195747;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ババ抜き前の下準備
 */
public class Cards {

    /**
     * トランプの山札作成 から 手札作成
     *
     * 引数なし
     * return 戻り値なし
     */
    void deck() {

        ArrayList<String> deck = new ArrayList<>(53);
        for (int i = 1; i < 14; i++) {
            deck.add("スペード：" + i);
            deck.add("ダイヤ：" + i);
            deck.add("ハート：" + i);
            deck.add("クラブ：" + i);
        }
        deck.add("ジョーカー");
        //System.out.println(deck);

        Collections.shuffle(deck); //山札をシャッフル

        System.out.println("山札"+deck);

        ArrayList<String> playerA = new ArrayList<>(); //プレイヤーAの手札準備
        ArrayList <String> playerB = new ArrayList<>(); //プレイヤーBの手札準備

        playerA.add(deck.get(0)); //山札からプレイヤーAの手札へ
        deck.remove(0);    //山札から加えたカードは無くなる
        playerB.add(deck.get(0));
        deck.remove(0);

        for (int i = 0; i < 25; i++) {
            playerA.add(deck.get(0));
            deck.remove(0);
            playerB.add(deck.get(0));
            deck.remove(0);
        }
        playerA.add(deck.get(0));
        deck.remove(0);

        System.out.println("");
        System.out.println("playerAの手札"+playerA);
        System.out.println("");
        System.out.println("playerBの手札"+playerB);

    }

    /**
     * プレイヤーAとプレイヤーBのカードの引き合う回数のカウンター
     *
     * 引数のあるメソッド
     * 引数の型　int
     * @param num
     */
    void counter(int num){
        int count =0 ;

        for(int i=1; i<num; i++){
            count += 1;
        }
        System.out.println( count+"回の引き合いで決着");
    }
}