package oop.inheritance.terminal.ingenico;
import oop.inheritance.terminal.Printer;
import oop.library.ingenico.services.IngenicoPrinter;

public class PrinterAdapter implements Printer {

    private final IngenicoPrinter ingenicoPrinter = new IngenicoPrinter();

    @Override
    public void print(int col, String text) {
        ingenicoPrinter.print(col,text);
    }

    @Override
    public void lineFeed() {
        ingenicoPrinter.lineFeed();
    }
}
