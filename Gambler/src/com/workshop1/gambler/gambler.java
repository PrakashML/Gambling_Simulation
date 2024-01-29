package com.workshop1.gambler;

import java.util.Random;
import java.util.Scanner;
public class gambler {
    int stake;
    int bet;
    int numgame;


    public gambler() {
        this.stake = 100;
        this.bet = 1;
        this.numgame = 10;
    }

    public static Boolean game(){
        if (Math.random()<0.5){
            return true;
        }
        else {
            return false;
        }
    }

    public static void Simulategame(int stake, int bet, int numgame){
        String result;
        for (int i=0; i<numgame; i++) {
            if (game()) {
                result = "win";
                stake += bet;

            } else {
                result = "lost";
                stake -= bet;
            }
            if (stake <= 50 || stake >= 150){
                System.out.println("Not able to Play furthur");
                break;
            }


            System.out.println("result: " + result);
            System.out.println("stakeValue : " + stake);
        }
    }


    public static void main(String[] args) {
        gambler g1 = new gambler();
        g1.Simulategame(100, 1, 20);
        System.out.println(g1);


    }
}