package comcun;

import java.util.Scanner;

class YatziMain {

    public Dice[] die = new Dice[5];
    public boolean gameIsOn = true;
    public int turn = 0;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new YatziMain();
    }

    YatziMain() {
        dices();
        playGame();
    }

    private void dices() {
        for (int i = 0; i < 5; i++) {
            die[i] = new Dice();
        }
    }

    private void playGame() {
        System.out.println("Welcome to Yatzi!");
        while (gameIsOn & turn < 3) {
            System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice");
            rollingDices();

            if (checkIfYatzi(die)) {
                System.out.println("You got YATZI! in " + die[0].value + "'s");
                return;
            }
            if (turn != 2) {
                System.out.println("Want to throw again? (y for yes, anything else for no)");
            } else {
                gameOver();
                return;
            }
            keepPlaying();
        }
    }

    private void rollingDices() {
        for (int i = 0; i < die.length; i++) {
            die[i].DiceRoll();
            System.out.println(i + ": " + die[i].getString());
        }
    }

    private void keepPlaying() {
        if (sc.next().equals("y")) {
            turn++;
        } else {
            gameIsOn = false;
        }
    }

    private void gameOver() {
        System.out.println("Game over! Want to play again?");
        if (sc.next().equals("y")) {
            turn = 0;
            playGame();
        }
    }

    static boolean checkIfYatzi(Dice[] ds) {
        boolean yatzi = true;
        for (int i = 1; i < 5; i++) {
            if (ds[i].value != ds[i - 1].value) {
                yatzi = false;
                break;
            }
        }
        return yatzi;
    }
}

// Cuneyt & Soleiman