package KnoppenApp;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.EventListener;

public class Licht {
	private PApplet app;
	private int kleur;
	private ArrayList<StateChangeEventHandler> listners = new ArrayList<StateChangeEventHandler>();
	
	
	public Licht(PApplet app) {
		this.app = app;
		kleur = 0;
	}
	
	void schakelLicht() {
		if (kleur == 0) {
			kleur = 0xFFA4C739;
		}
		else {
			kleur = 0;
		}
		for (StateChangeEventHandler h : listners){
			h.change();
		}
	}
	
	public void tekenLicht() {
		app.background(kleur);
	}

	public void addListner(StateChangeEventHandler l){
		listners.add(l);
	}

	public boolean isAan(){
		return kleur != 0;
	}

	static class StateChangeEventHandler implements EventListener{
		public void change(){

		}
	}
}