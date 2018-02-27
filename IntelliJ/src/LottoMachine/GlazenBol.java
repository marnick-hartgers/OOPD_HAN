package LottoMachine;

import java.util.ArrayList;
import java.util.Random;

public class GlazenBol {
    private Bal[] _ballen = new Bal[45];

    private ArrayList<Bal> _ballenInBol = new ArrayList<Bal>();

    private Random _random = new Random();

    public GlazenBol() {
        for (int i = 0; i < _ballen.length; i++) {
            _ballen[i] = new Bal(i + 1);
        }
    }

    public void verzamelAlleBallen() {
        for (int i = 0; i < _ballen.length; i++) {
            _ballenInBol.add(_ballen[i]);
        }
    }

    public Bal schepBal() {
        if (_ballenInBol.size() == 0) {
            return null;
        }
        int index = _random.nextInt(_ballenInBol.size() - 1);
        Bal b = _ballenInBol.get(index);
        _ballenInBol.remove(b);
        return b;
    }
}
