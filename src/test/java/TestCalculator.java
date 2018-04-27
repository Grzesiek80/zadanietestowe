import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    StringCalculator calc;
    @Before
    public void setupTest() {
        calc = new StringCalculator();
    }
    @Test
    public void testEmptyString() {
       int result = calc.add("");
       assertEquals(0,result);
    }

    @Test

    public void testOneNumber() {
        int result = calc.add("7");
        assertEquals(7,result);
    }

    @Test

    public void testTwoNumber() {
        int result = calc.add("3+5");
        assertEquals(8,result);
    }
}
