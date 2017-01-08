import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by root on 1/8/17.
 */
public class CalculatorTest {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Calculator calculator = new Calculator();
        //
        //assert statements
        assertEquals("10 + 2 must be 12", 16, calculator.sum(10, 2));
        assertEquals("11 - 5 must be 0", 6, calculator.res(11, 5));
    }
}
