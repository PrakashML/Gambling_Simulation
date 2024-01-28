package com.workshop1.gambler;

import java.util.Random;

public class gambler {
    int stake = 100;
    int bet = 1;
    public gambler(){
        this.stake = stake;
        this.bet = bet;
    }
    public void game(){
        boolean win = new Random().nextBoolean();
        if(win){
            stake+=bet;
            System.out.println("You Won!, Your current stake is: "+ stake);
        }
        else{
            stake-=bet;
            System.out.println("You lost!, Your current stake is: "+ stake);
        }
    }

    public static void main(String[] args) {
        gambler g1 = new gambler();
        g1.game();
    }
}
