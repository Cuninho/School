package comcun;

public class Die {

    private int value = 0;

    void DieRoll() {
        value = (int)(Math.random()*6+1);
    }
        String getString() {
        return "Dice shows " + value;
    }

    void setValue(int val) {
        this.value = val;
    }

    int getValue(){
        return this.value;
    }
}