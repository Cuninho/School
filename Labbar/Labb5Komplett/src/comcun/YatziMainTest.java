package comcun;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YatziMainTest {

    @Test
    @DisplayName("Testing if yatzi is true")
    void ifYatziTrue() {

        YatziMain ym = new YatziMain();

        Dice[] die = new Dice[5];
        for (int i = 0; i < die.length; i++) {
            die[i] = new Dice();
            die[i].value = 1;

        }
        assertTrue(ym.checkIfYatzi(die));
    }

    @Test
    @DisplayName("Testing if yatzi is false")
    void ifYatziFalse() {
        YatziMain ym = new YatziMain();
        ym.checkIfYatzi(ym.die);

        Dice[] die = new Dice[5];
        for (int i = 0; i < die.length; i++) {
            die[i] = new Dice();
            die[i].value = 1;
        }
        die[0].value = 2;
        assertFalse(ym.checkIfYatzi(die));
    }

}


