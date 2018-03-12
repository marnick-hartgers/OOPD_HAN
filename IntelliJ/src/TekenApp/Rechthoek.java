package TekenApp;

public class Rechthoek extends Figuur {

    private int sizeX, sizeY;

    public Rechthoek(int posX, int posY, int sizeX, int sizeY){
        super(posX, posY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    @Override
    public void teken(TekenApp app) {
        app.fill(255,0,0);
        app.stroke(255,255,255);
        app.rect(posX, posY, sizeX, sizeY);
    }

    @Override
    public boolean isMuisBinnen(int mousex, int mousey) {
        return (mousex > posX && mousex < posX + sizeX && mousey > posY && mousey < posY + sizeY);
    }
}
