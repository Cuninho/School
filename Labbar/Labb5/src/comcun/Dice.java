package comcun;

    public class Dice extends BoardGameMaterial {
    public int value;

    public int DiceRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public String getString() {
        return "Dice shows " + value;
    }
}