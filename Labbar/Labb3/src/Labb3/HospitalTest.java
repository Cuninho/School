package Labb3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {


    @Test
    void doctors () {
        Patient p = new Patient("", "");
        p.getName();
        p.getSickness();
        assertEquals(p.getName(), p.getSickness());
    }
    @Test
    void doctorName() {

    }
}
