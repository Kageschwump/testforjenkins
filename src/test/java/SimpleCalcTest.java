
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SimpleCalcTest {


    @Test
    void calc(){

        var simpleCalc = new SimpleCalc();

        assertEquals(3, simpleCalc.calc(1,2));
        assertEquals(11, simpleCalc.calc(3,7));
        assertEquals(6, simpleCalc.calc(2,4));

    }

}
