package KnoppenApp;

import processing.core.PApplet;

public class LichtKnop extends Knop {

	private IDoelWit licht;

	
	public LichtKnop(PApplet app, IDoelWit licht, float x, float y, float breedte,
			float hoogte) {
		super(app, x, y, breedte, hoogte);
		this.licht = licht;
		
	}

	public void teken(){

		licht.teken();
		super.teken();

	}

	public void doeKnopActie() {
		licht.schakel();
	}

}
