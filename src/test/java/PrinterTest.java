import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 100);
    }

    @Test
    public void getPaperLeft() {
        assertEquals(10, printer.getPaperLeft());
    }

    @Test
    public void printTestSufficientPaper() {
        printer.print(1, 1);
        assertEquals(9, printer.getPaperLeft());
    }

    @Test
    public void printTestInsufficientPaper() {
        printer.print(20, 2);
        assertEquals(10, printer.getPaperLeft());
    }

    @Test
    public void refillTest() {
        printer.print(1, 1);
        printer.refill();
        assertEquals(10, printer.getPaperLeft());
    }

    @Test
    public void getToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void tonerIsReducedDuringPrintTest() {
        printer.print(10, 1);
        assertEquals(90, printer.getToner());
    }

}
