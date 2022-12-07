package oop.inheritance.terminal.verifone;
import oop.inheritance.terminal.Keyboard;
import oop.library.v240m.VerifoneV240mKeyboard;

public class KeyboardAdapter implements Keyboard {

    private final VerifoneV240mKeyboard verifoneV240mKeyboard;

    public KeyboardAdapter(){
        verifoneV240mKeyboard = new VerifoneV240mKeyboard();
    }

    @Override
    public String getChar() {
        return verifoneV240mKeyboard.get();
    }
}
