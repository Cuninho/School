package comcun;

import java.util.Scanner;

public class YatzyMain {

    private Dice[] ds = new Dice[5];
    private int turn = 0;
    private Scanner sc = new Scanner(System.in);

    private YatzyMain() {
        dices();
        runGame();
    }

    private void dices() {
        for (int i = 0; i < 5; i++) {
            ds[i] = new Dice();
        }
    }

    private void runGame() {
        System.out.println("Welcome to Yatzi");
        while (turn < 3) {
            System.out.println("Type y to roll the dices");

            if (sc.next().equals("y")) {
                System.out.println("Starting turn " + (turn = turn + 1) + " of 3, rolling dice.");
                rollingDices();

            }else {
                System.out.println("Have a nice day");
                return;
            }
        }
        gameOver();
    }

    private void rollingDices() {
        for (int i = 0; i < ds.length; i++) {
            ds[i].DiceRoll();
            //ds[i].value = 5; //Test if yatzi work
            System.out.println(i + "" + ds[i].getString());
        }
        if (checkIfYatzi(ds)) {
            System.out.println("GRATZ you got YATZYYY");
        } else {
            System.out.println("You SUUUUUCK!!!");
        }
    }

    public static boolean checkIfYatzi(Dice[] ds) {
        boolean yatzi = true;
        for (int i = 1; i < ds.length; i++) {
            if (ds[i].getValue() != ds[i - 1].getValue()) {
                yatzi = false;

                break;
            }
        }
        return yatzi;
    }

    private void gameOver() {
        System.out.println("Game over, press y to play again. Anything else will cancel the game");
        if (sc.next().equals("y")) {
            turn = 0;
            runGame();

        } else {
            System.out.println("Have a nice day");
        }
    }

    public static void main(String[] args) {
        new YatzyMain();
    }
}



















