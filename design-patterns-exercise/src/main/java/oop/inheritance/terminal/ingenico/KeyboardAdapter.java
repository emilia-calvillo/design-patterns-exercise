package oop.inheritance.terminal.ingenico;
import oop.inheritance.terminal.Keyboard;
import oop.library.ingenico.services.IngenicoKeyboard;

public class KeyboardAdapter implements Keyboard {

    private final IngenicoKeyboard ingenicoKeyboard;

    public KeyboardAdapter(){
        ingenicoKeyboard = new IngenicoKeyboard();
    }
    @Override
    public String getChar() {
        return ingenicoKeyboard.getChar();
    }
}
