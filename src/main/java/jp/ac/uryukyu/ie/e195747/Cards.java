package jp.ac.uryukyu.ie.e195747;

import java.util.ArrayList;
import java.util.Collections;

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

        Collections.shuffle(deck);
        System.out.println(deck);
        ArrayList<String> playerA = new ArrayList<>();
        ArrayList <String> playerB = new ArrayList<>();

        playerA.add(deck.get(0));
        deck.remove(0);
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

        System.out.println(playerA);
        System.out.println(playerB);

    }
}