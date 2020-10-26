package comcun;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YatzyMainTest {

    @Test
    @DisplayName("Checking if yatzy")
    void checkIfYatzy() {

        Dice[] ds = new Dice[5];
        for (int i = 0; i < ds.length; i++) {
            ds[i] = new Dice();
            ds[i].value = 1;
        }
        assertTrue(YatzyMain.checkIfYatzi(ds));
    }

    @Test
    @DisplayName("Checking if yatzy")
    void checkIfNotYatzy() {
        Dice[] ds = new Dice[5];
        for (int i = 0; i < ds.length; i++) {
            ds[i] = new Dice();
            ds[i].value = 1;
        }
        ds[0].value = 2;
        assertFalse(YatzyMain.checkIfYatzi(ds));
    }
}