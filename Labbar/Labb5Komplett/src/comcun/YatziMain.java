package comcun;

import java.util.Scanner;

class YatziMain {
    private Die[] die = new Die[5];
    private int turn = 0;
    private Scanner sc = new Scanner(System.in);

    YatziMain() {

    }

    private void dice() {
        for (int i = 0; i < 5; i++) {
            die[i] = new Die();
        }
    }

    private void playGame() {
        System.out.println("Welcome to Yatzi!");
        while (turn < 3) {
            System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice");
            rollingDice();

            if (checkIfYatzi(die)) {
                System.out.println("You got YATZI! in " + die[0].getValue() + "'s");
                System.exit(0);
            } else if (turn != 2) {
                System.out.println("Want to throw again? (y for yes, anything else for no)");
            } else {
                gameOver();
                System.exit(0);
            }
            keepPlaying();
        }
    }

    private void rollingDice() {
        for (int i = 0; i < die.length; i++) {
            die[i].DieRoll();
            System.out.println(i + ": " + die[i].getString());
        }
    }

    private void keepPlaying() {
        if (sc.next().equals("y")) {
            turn++;
        } else {
            System.exit(0);
        }
    }

    private void gameOver() {
        System.out.println("Game over! Want to play again?");
        if (sc.next().equals("y")) {
            turn = 0;
            playGame();
        }
    }

    boolean checkIfYatzi(Die[] ds) {
        boolean yatzi = true;
        for (int i = 1; i < 5; i++) {
            if (ds[i].getValue() != ds[i - 1].getValue()) {
                yatzi = false;
                break;
            }
        }
        return yatzi;
    }

    public static void main(String[] args) {
        YatziMain main = new YatziMain();
        main.dice();
        main.playGame();
    }
}

// Cuneyt & Soleiman