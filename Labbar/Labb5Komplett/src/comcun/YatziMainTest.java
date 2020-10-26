package comcun;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YatziMainTest {

    @Test
    @DisplayName("Testing if yatzi is true")
    void ifYatziTrue() {

        Dice[] die = new Dice[5];
        for (int i = 0; i < die.length; i++) {
            die[i] = new Dice();
            die[i].value = 1;
        }
        assertTrue(YatziMain.checkIfYatzi(die));
    }

    @Test
    @DisplayName("Testing if yatzi is false")
    void ifYatziFalse() {

        Dice[] die = new Dice[5];
        for (int i = 0; i < die.length; i++) {
            die[i] = new Dice();
            die[i].value = 1;
        }
        die[0].value = 2;
        assertFalse(YatziMain.checkIfYatzi(die));
    }

}


