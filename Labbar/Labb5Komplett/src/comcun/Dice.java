package comcun;

public class Dice {

    public int value = 0;

    public int DiceRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }
    public String getString() {
        return "Dice shows " + value;
    }
}