package com.workshop.gambling;
import java.util.Random;
import java.util.Random;
public class Gambler {
    private int stake;
    private final int betAmount = 1;

    public Gambler(int initialStake) {
        this.stake = initialStake;
    }

    public void playGame() {
        boolean win = new Random().nextBoolean();

        if (win) {
            stake += betAmount;
            System.out.println("You won! Current stake: $" + stake);
        } else {
            stake -= betAmount;
            System.out.println("You lost. Current stake: $" + stake);
        }
    }

    public void simulateGames(int numGames) {
        for (int i = 0; i < numGames; i++) {
            if (stake <= 0) {
                System.out.println("Out of money. Game over.");
                break;
            }

            playGame();
        }
    }

    public static void main(String[] args) {
        Gambler gambler = new Gambler(100);

        gambler.simulateGames(20);
    }
}
