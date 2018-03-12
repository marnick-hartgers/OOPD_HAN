package RadioKnoppenApp;

import processing.core.PApplet;

import java.util.ArrayList;

public abstract class Knop{
    protected PApplet app;

    protected float x, y, breedte, hoogte;

    protected ArrayList<IDoelwit> _doelen = new ArrayList<>();

    public Knop(PApplet app, float x, float y, float breedte,
                float hoogte) {
        this.app = app;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public void teken() {
        app.stroke(95);
        app.fill(80);
        app.rect(x, y, breedte, hoogte);
    }

    public boolean isMuisOverKnop() {
        if (app.mouseX >= x && app.mouseX < x + breedte &&
                app.mouseY >= y && app.mouseY < y + hoogte) {
            return true;
        }
        else {
            return false;
        }
    }

    public void voegDoelToe(IDoelwit d){
        _doelen.add(d);
    }

    public void handelInteractieAf() {
        if(isMuisOverKnop()) {
            doeKnopActie();
        }
    }

    protected void doeKnopActie(){
        for(IDoelwit d : _doelen){
            d.schakel();
        }
    }

}
