package com.code_envolved;

import com.code_envolved.ui.CeWindow;
import com.code_envolved.ui.Models.Rectangle;
import com.code_envolved.ui.Models.Vec2;
import com.code_envolved.ui.component.CeUiComponentContainer;
import processing.core.PApplet;

public class TestButton extends CeUiComponentContainer {

    public TestButton() {
        super();
    }

    public TestButton(Rectangle pos) {
        super(pos);
    }



    @Override
    public void draw(CeWindow window, Vec2 parentOffset) {
        position.setOffset(parentOffset);

        window.rectMode(PApplet.CORNER);
        window.fill(255,100,100);
        window.stroke(255,0,0);
        window.strokeWeight(2);
        window.rect(position.x(), position.y(),position.width(),position.height());

        super.draw(window, parentOffset);
    }
}
