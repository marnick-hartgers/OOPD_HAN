package LottoMachine;

import java.util.ArrayList;

public class LottoMachine {

    private GlazenBol _glazeBol;
    private ScoreBord _bord;

    public LottoMachine() {
        _glazeBol = new GlazenBol();
        _bord = new ScoreBord();
    }

    public void voerTrekkingUit() {
        _glazeBol.verzamelAlleBallen();
        _bord.maakLeeg();
        for (int i = 0; i < 6; i++) {
            Bal b = _glazeBol.schepBal();
            _bord.plaatsBal(b);
        }
        _bord.plaatsBonusBal(_glazeBol.schepBal());
        _bord.sorteerBallen();
        _bord.printScoreBord();
    }
}
