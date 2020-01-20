package jp.ac.uryukyu.ie.e195747;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CardsTest {

    @Test
    void deck() {

        var str_array = new ArrayList<String>();
        str_array.add("スペード：1");
        str_array.add("クラブ：13");

        for(var e : str_array) {
            //System.out.println(e);
        }
        System.out.println("山札は"+str_array);

        ArrayList<String> playerA = new ArrayList<>();
        ArrayList <String> playerB = new ArrayList<>();

        playerA.add(str_array.get(0));
        str_array.remove(0);
        playerB.add(str_array.get(0));
        str_array.remove(0);

        System.out.println("選手Aさんの手札"+playerA);
        System.out.println("選手Bさんの手札"+playerB);

    }
}