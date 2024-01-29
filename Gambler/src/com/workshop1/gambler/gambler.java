package com.workshop1.gambler;

import java.util.Random;
import java.util.Scanner;

public class gambler {
    int stake = 100;
    int stakecalc = 100;
    int bet = 1;
    int numgames = 0;
    int tot_win = 0;
    int tot_lost = 0;
    public gambler(){
        this.stake = stake;
        this.bet = bet;
    }
    public void game(){
        boolean win = new Random().nextBoolean();
        if(win){
            stakecalc+=bet;
            tot_win++;
            System.out.println("You Won! Current stake: "+ stakecalc);
        }
        else{
            stakecalc-=bet;
            tot_lost++;
            System.out.println("You lose! Current stake: "+ stakecalc);
        }
    }

    public void simulategame(int n){
        for(int i=1;i<=n;i++){
            
            System.out.println("\nDay: " + i);
            if(stake <= 0){
                System.out.println("Out of money, Game over");
                break;
            }
            while(stakecalc>0 && stakecalc>=0.5*stake){
                game();
            }
            stakecalc = stake;
        }
        System.out.println("\nOverall results after 20 days: ");
        System.out.println("Total Wins: " + tot_win);
        System.out.println("Total lose: " + tot_lost);
    }

    public static void main(String[] args) {
        gambler g1 = new gambler();
        g1.simulategame(20);

    }
}
