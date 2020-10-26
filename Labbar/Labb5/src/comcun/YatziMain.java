package comcun;

import java.util.Scanner;

public class YatziMain {

    public static Dice[] dice;
    public static boolean GameIsOn = true;
    public static int turn = 0;
    public static boolean yatzi = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dice = new Dice[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Dice();
        }
        while (GameIsOn & turn < 3) {
            System.out.println("Welcome to Yatzi\n" + "Starting turn " + (turn + 1) + " of 3, rolling dice.");
            for (int i = 0; i < dice.length; i++) {
                dice[i].DiceRoll();
                //dice[i].value = 4; //Test if yatzi work
                System.out.println(i + ": " + dice[i].getString());
            }
            for (int j = 1; j < dice.length; j++) {
                if (dice[j].value != dice[j - 1].value) {
                    yatzi = false;
                }
            }
            if (yatzi) {
                System.out.println("You got YATZI! in " + dice[0].value + "'s");
                return;
            } else if (turn != 2) {
                System.out.println("Want to throw again? (y for yes, anything else for no)");
                if (sc.next().equals("y")) {
                    turn++;
                } else {
                    GameIsOn = !GameIsOn;
                }
            } else {
                System.out.println("Game over! Want to play again?");
                if (sc.next().equals("y")) {
                    turn = 0;
                }
            }
        }
    }
}