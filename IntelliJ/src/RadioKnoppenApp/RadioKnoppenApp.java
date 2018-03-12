package RadioKnoppenApp;

import processing.core.PApplet;

import java.util.ArrayList;

public class RadioKnoppenApp extends PApplet {

    ArrayList<Knop> knoppen = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("week5.ifelsenaarinterface.TekenApp");
    }

    public void settings(){
        size(400, 400);
    }

    public void setup() {
        RadioKnop a = new RadioKnop(this, 50,50,30,30);
        RadioKnop b = new RadioKnop(this, 50,100,30,30);
        RadioKnop c = new RadioKnop(this, 50,150,30,30);

        a.setState(true);

        a.voegDoelToe(b);
        a.voegDoelToe(c);

        b.voegDoelToe(a);
        b.voegDoelToe(c);

        c.voegDoelToe(a);
        c.voegDoelToe(b);

        knoppen.add(a);
        knoppen.add(b);
        knoppen.add(c);
    }

    public void draw(){
        for(Knop k : knoppen){
            k.teken();
        }
    }

    public void mousePressed(){
        for(Knop k : knoppen){
            k.handelInteractieAf();
        }
    }
}
