package Figuren1;

import processing.core.PApplet;

public class Main extends PApplet {

    Figuur rh;
    Figuur c;

    @Override
    public void setup() {
        rh = new Rechthoek(100, 100, 20, 20);
        c = new Cirkel(0, 170, 30);
        rh.setKleur(0xFF0000FF);
        c.setKleur(0xFF00FFFF);

        rh.setVersnelling(0.01f, 0.01f);
        rh.setSnelheid(-1f, -1f);
        c.setVersnelling(-0.01f, 0.01f);
        c.setSnelheid(1.5f, -1.5f);
    }

    @Override
    public void settings() {
        size(200, 200);
    }


    @Override
    public void draw() {
        clear();

        rh.doeStap();
        c.doeStap();

        rh.teken(this);
        c.teken(this);


    }


}
