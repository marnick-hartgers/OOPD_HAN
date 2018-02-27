package LottoMachine;

import processing.core.PApplet;

public class Window extends PApplet {
    private LottoMachine machine = new LottoMachine();

    public void setup(){
        super.setup();
        machine.voerTrekkingUit();
    }

    public void settings(){
        super.settings();

        size(400,400);
    }

    public void draw(){
    }

    public void mouseReleased() {
        machine.voerTrekkingUit();
        super.mouseReleased();

    }
}
