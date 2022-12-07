package oop.inheritance.terminal.verifone;
import oop.inheritance.terminal.Display;
import oop.library.v240m.VerifoneV240mDisplay;

public class DisplayAdapter implements Display {

    private VerifoneV240mDisplay verifoneV240mDisplay;

    public DisplayAdapter(){
        verifoneV240mDisplay = new VerifoneV240mDisplay();
    }
    @Override
    public void showMessage(int x, int y, String text) {
        verifoneV240mDisplay.print(x,y,text);
    }

    @Override
    public void clear() {
        verifoneV240mDisplay.clear();
    }
}
