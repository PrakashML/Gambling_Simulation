package com.workshop1.gambler;

import java.util.Random;
import java.util.Scanner;

public class gambler {
    int stake = 100;
    int stakecalc = 100;
    int bet = 1;
    int numgames = 0;
    public gambler(){
        this.stake = stake;
        this.bet = bet;
    }
    public void game(){
        boolean win = new Random().nextBoolean();
        if(win){
            stakecalc+=bet;
            System.out.println("You Won! Current stake: "+ stakecalc);
        }
        else{
            stakecalc-=bet;
            System.out.println("You lose! Current stake: "+ stakecalc);
        }
    }

    public void simulategame(int n){
        for(int i=0;i<n;i++){
            numgames+=1;
            if(stake <= 0){
                System.out.println("Out of money, Game over");
                break;
            }
            game();
            if(stakecalc<=0.5*stake){
                System.out.println("Resigning for the Day. Current stake: " + stakecalc);
                System.out.println("No of games played for the day: "+ numgames);
                break;
            }
        }
    }

    public static void main(String[] args) {
        gambler g1 = new gambler();
        g1.simulategame(Integer.MAX_VALUE);

    }
}
