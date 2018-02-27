package LottoMachine;
import java.util.ArrayList;

public class ScoreBord {
    private ArrayList<Bal> _ballen = new ArrayList<Bal>();
    private Bal _bonusBal = null;

    public void plaatsBal(Bal bal) {
        _ballen.add(bal);
    }

    public void plaatsBonusBal(Bal bal) {
        _bonusBal = bal;
    }

    public void sorteerBallen() {
        _ballen.sort((o1, o2) -> o1.getNummer() > o2.getNummer() ? 1 : -1);
    }

    public void printScoreBord() {

        String winnendeNummers = "";
        for (Bal b : _ballen) {
            winnendeNummers += b.getNummer() + " ";
        }
        winnendeNummers += "\nBonus bal: " + (_bonusBal != null ? _bonusBal.getNummer() : "GEEN");

        String uitkomst = "\n========L=O=T=T=O=======\n" +
                "De winnende nummers zijn\n" +
                winnendeNummers + "\n" +
                "========================\n";
        System.out.print(uitkomst);
    }

    public void maakLeeg() {
        _ballen.clear();
        _bonusBal = null;
    }


}
