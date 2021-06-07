import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(2, 3);
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(5, calculator.divide(15.0, 3.0), 0.0);
    }

}
