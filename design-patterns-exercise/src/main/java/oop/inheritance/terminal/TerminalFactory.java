package oop.inheritance.terminal;
import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.terminal.ingenico.IngenicoTerminalFactory;
import oop.inheritance.terminal.verifone.Verifone240TerminalFactory;

public abstract class TerminalFactory {

    public static TerminalFactory getFactory(SupportedTerminal supportedTerminal) {

        switch (supportedTerminal){
            case INGENICO:
                return new IngenicoTerminalFactory();
            case VERIFONE:
                return new Verifone240TerminalFactory();
        }
        return null;
    }

    public abstract Display getDisplay();
    public abstract Keyboard getKeyboard();

    public abstract Printer getPrinter();

}
