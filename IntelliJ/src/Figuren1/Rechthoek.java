package Figuren1;
import processing.core.PApplet;

public class Rechthoek extends Figuur{

    private float breedte, hoogte;

    public Rechthoek(float x, float y, float breedte, float hoogte) {
        super(x,y);
        this.breedte = breedte;
        this.hoogte = hoogte;
        zetStil();
        kleur = 0xFFFFFFFF;
    }



    public void teken(PApplet p) {
        p.noStroke();
        p.fill(kleur);
        p.rect(x, y, breedte, hoogte);
    }

}

