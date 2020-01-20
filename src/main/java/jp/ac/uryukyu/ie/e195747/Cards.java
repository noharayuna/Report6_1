package jp.ac.uryukyu.ie.e195747;

import java.util.ArrayList;

public class Cards {
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
    }
}