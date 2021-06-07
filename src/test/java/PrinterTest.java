import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 20);
    }

    @Test
    public void canPrintYes(){
        printer.print(5, 2);
        assertEquals(40, printer.checkSheets());
        assertEquals(10, printer.checkToner());
    }

    @Test
    public void canPrintNo(){
        printer.print(10, 6);
        assertEquals(50, printer.checkSheets());
        assertEquals(20, printer.checkToner());
    }


}
