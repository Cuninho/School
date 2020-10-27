package comcun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class YatziMainTest {

    @Test
    @DisplayName("Testing if yatzi is true")
    void ifYatziTrue() {

        Die[] die = new Die[5];
        for (int i = 0; i < die.length; i++) {
            die[i] = new Die();
            die[i].setValue(1);
        }
            Assertions.assertTrue(YatziMain.checkIfYatzi(die));
    }

    @Test
    @DisplayName("Testing if yatzi is false")
    void ifYatziFalse() {
        Die[] die = new Die[5];
        for (int i = 0; i < die.length; i++) {
            die[i] = new Die();
            die[i].setValue(1);
        }
        die[0].setValue(2);
        assertFalse(YatziMain.checkIfYatzi(die));
    }

}


