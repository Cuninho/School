package comcun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class YatziMainTest {

    @Test
    @DisplayName("Testing if yatzi is true")
    public void testIfYatziTrue() {
        Dice[] diceTest = new Dice[5];
        for (Dice dice : diceTest) {
            dice.value = 6;
        }
        diceTest[5].value = 1;
    }

    @Test
    @DisplayName("Testing if yatzi is False")
    public void checkIfYatziFalse() {

        Dice[] diceTest = new Dice[5];
        for (Dice dice : diceTest) {
            dice.value = 6;
        }
        diceTest[5].value = 1;
    }
}


    /*@Test
    @DisplayName("is Yatzi false?")
    public void testingYatziFalse() {
        Dice[] diceTest = new Dice[5];
        for (Dice dice : diceTest) {
            dice.value = 6;
        }
        diceTest[5].value = 1;

    }
}

     */