package com.workshop1.gambler;

import java.util.Random;
import java.util.Scanner;
public class gambler {
    public static Boolean WinOrLoss(){
        if (Math.random()<0.5){
            return true;
        }
        else {
            return false;
        }
    }

    public static int simulateGambling(int initialStake, int betAmount, int numgame){
        String result;
        int totalAmountWonOrLost=0;
        for (int day=1; day<=numgame; day++) {
            int currentStake = initialStake;

            while (currentStake > 50 && currentStake < 150) {

                if (WinOrLoss()) {
                    result = "win";
                    currentStake += betAmount;

                } else {
                    result = "lost";
                    currentStake -= betAmount;
                }
            }
            int amountWonOrLost = currentStake - initialStake;
            totalAmountWonOrLost+=amountWonOrLost;

            System.out.println("Day " + day + ": Amount Won or Lost - $ " + amountWonOrLost);

        }
        return totalAmountWonOrLost;
    }


    public static void main(String[] args) {
        int initialStake = 100;
        int betAmount = 1;
        int noOfDays = 20;

        int totalAmountWonOrLost = simulateGambling(initialStake, betAmount, noOfDays);
        System.out.println("Total amount won or lost after 20 days: $" + totalAmountWonOrLost);


    }
}