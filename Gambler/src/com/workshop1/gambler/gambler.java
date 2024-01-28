package com.workshop1.gambler;

import java.util.Random;

public class gambler {
    int stake = 100;
    int bet = 1;
    public gambler(){
        this.stake = stake;
        this.bet = bet;
    }


    public static void main(String[] args) {
        gambler g1 = new gambler();
        System.out.println("Stake for each day: " + g1.stake);
        System.out.println("Bet for each game :" + g1.bet);
    }
}
