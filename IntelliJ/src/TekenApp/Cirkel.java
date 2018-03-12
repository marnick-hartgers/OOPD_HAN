package TekenApp;

public class Cirkel extends Figuur {

    public int size;

    public Cirkel(int posX, int posY, int size){
        super(posX, posY);
        this.size = size;
    }

    @Override
    public void teken(TekenApp app) {
        app.fill(255,0,0);
        app.stroke(255,255,255);
        app.ellipseMode(TekenApp.CORNER);
        app.ellipse(posX, posY, size, size);
    }

    @Override
    public boolean isMuisBinnen(int mousex, int mousey) {
        return (mousex > posX && mousex < posX + size && mousey > posY && mousey < posY + size);
    }
}
