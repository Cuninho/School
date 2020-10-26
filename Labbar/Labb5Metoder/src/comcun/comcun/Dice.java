package comcun;

public class Dice {
    public int value = 0;

    public int DiceRoll() {
        value = (int) (Math.random() *6 + 1);
        return value;
    }

    public String getString() {
        return "st Dice shows " + value;
    }

    public int getValue() {
        return this.value;
    }

}



/*
    public static void Dices() {
        ds = new Dice[5];
        for (int i = 0; i < 5; i++) {
            ds[i] = new Dice();
        }
    }
 */




/*
    public static void ifYatziTrue() {
        if (yatzi) {
            System.out.println("You got YATZI! in " + ds[0].value + "'s");
            return;
        }
    }

 */