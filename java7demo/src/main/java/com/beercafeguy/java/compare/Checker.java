package com.beercafeguy.java.compare;

import java.util.Comparator;

public class Checker implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2) {
        int res=0;
        if(p1.getScore() !=p2.getScore()){
            res=p2.getScore()-p1.getScore();
        }else{
            res=p1.getName().compareTo(p2.getName());
        }
        return res;
    }
}
