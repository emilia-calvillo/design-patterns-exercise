package oop.inheritance.terminal.verifone;
import oop.inheritance.terminal.Printer;
import oop.library.v240m.VerifoneV240mPrinter;

public class PrinterAdapter implements Printer {

    private final VerifoneV240mPrinter verifoneV240mPrinter = new VerifoneV240mPrinter();

    @Override
    public void print(int col, String text) {
        verifoneV240mPrinter.print(col,text);
    }

    @Override
    public void lineFeed() {
        verifoneV240mPrinter.lineFeed();
    }
}
