package com.workshop1.gambler;

public class gambler {
    public static Boolean game(){
        if (Math.random()<0.5){
            return true;
        }
        else {
            return false;
        }
    }

    private static void simulateGambling(int initialStake, int betAmount, int noOfDays, int noOfMonths, int noOfGames){
        for (int month = 1; month <= noOfMonths; month++) {
            int totalAmountWonOrLost = 0;
            int totalDaysWon = 0;
            int totalDaysLost = 0;
            int luckiestDay = 0;
            int unluckiestDay = 0;
            int maxWin = 0;
            int maxLoss = 0;
            for (int day = 1; day <= noOfDays; day++) {
                int currentStake = initialStake;

                while (currentStake > 50 && currentStake < 150) {
                    for ( int game = 1; game <= noOfGames; game++){
                        if (game()) {
                            currentStake += betAmount;
                        }
                        else {
                            currentStake -= betAmount;
                        }
                    }
                }
                int amountWonOrLost = currentStake - initialStake;
                totalAmountWonOrLost += amountWonOrLost;

                if (amountWonOrLost > 0) {
                    totalDaysWon++;
                }
                else{
                    totalDaysLost++;
                }
                if (amountWonOrLost > maxWin){
                    maxWin = amountWonOrLost;
                    luckiestDay = day;

                }
                if (amountWonOrLost < maxLoss){
                    maxLoss = amountWonOrLost;
                    unluckiestDay = day;

                }
                System.out.println("Month " + month + " Day " + day + ": Amount Won or Lost - $ " + amountWonOrLost);

            }
            System.out.println("Month " + month + " : Total amount won or lost - $" + totalAmountWonOrLost);
            System.out.println("Month " + month + " : Total Days Won - " + totalDaysWon);
            System.out.println("Month " + month + " : Total Days Lost - " + totalDaysLost);
            System.out.println("Month " + month + " : Luckiest Day - " + luckiestDay + " ( Amount: $" + maxWin + " )");
            System.out.println("Month " + month + " : Unluckiest Day - " + unluckiestDay + " ( Amount: $" + maxLoss + " )");
            if (totalAmountWonOrLost < 0){
                break;
            }
        }

    }


    public static void main(String[] args) {
        int initialStake = 100;
        int betAmount = 1;
        int noOfDays = 20;
        int noOfMonths = 12;
        int noOfGames = 100;
        simulateGambling(initialStake, betAmount, noOfDays, noOfMonths, noOfGames);





    }
}