package TekenApp;

public abstract class Figuur  {

    protected int posX, posY;

    public Figuur(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public abstract void teken(TekenApp app);

    public abstract boolean isMuisBinnen(int mousex, int mousey);
}
