package LottoMachine;

import java.util.ArrayList;

public class GlazenBol {
    private Bal[] ballen = new Bal[45];

    private ArrayList<Bal> ballenInBol = new ArrayList<Bal>();

    public GlazenBol(){
        for(int i =0; i < ballen.length;i++){
            ballen[i] = new Bal(i+1);
        }
    }

    public void verzamelAlleBallen(){
        for(int i =0; i < ballen.length;i++){
            ballenInBol.add(ballen[i]);
        }
    }

    public Bal schepBal(){
        return ballenInBol
    }


}
