package Figuren1;

import processing.core.PApplet;

public abstract class Figuur {

    protected float x, y, vx, vy, ax, ay;
    protected int kleur;

    public Figuur(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setSnelheid(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void setVersnelling(float ax, float ay) {
        this.ax = ax;
        this.ay = ay;
    }

    public void zetStil() {
        vx = vy = ax = ay = 0;
    }

    public boolean staatStil() {
        return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
    }

    public void doeStap() {
        if (!staatStil()) {
            pasVersnellingToe();
            pasSnelheidToe();
        }
    }

    public void setKleur(int kleur) {
        this.kleur = kleur;
    }

    public abstract void teken(PApplet p);

    private void pasVersnellingToe() {
        vx += ax;
        vy += ay;
    }

    private void pasSnelheidToe() {
        x += vx;
        y += vy;
    }
}
