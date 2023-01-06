
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SimpleCalcTest {


    @Test
    void calc(){

        var simpleCalc = new SimpleCalc();

        assertEquals(3, simpleCalc.calc(1,2));
        assertEquals(11, simpleCalc.calc(4,7));
        assertEquals(5, simpleCalc.calc(2,4));

    }

}
