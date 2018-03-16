package com.code_envolved;

import com.code_envolved.ui.CeWindow;
import com.code_envolved.ui.Models.Rectangle;
import com.code_envolved.ui.Models.Vec2;
import com.code_envolved.ui.component.CeUiComponent;
import com.code_envolved.ui.component.ICeMouseEventReaction;
import com.code_envolved.ui.component.ICeUiComponent;
import com.code_envolved.ui.component.events.ComponentEvent;
import processing.core.PApplet;

public class TestLight extends CeUiComponent implements ICeMouseEventReaction {

    private LightState state = LightState.notConnected;

    public TestLight() {
        super();
    }

    public TestLight(Rectangle pos) {
        super(pos);
    }


    @Override
    public void onReacionAdded(ICeUiComponent comp) {
        state = LightState.off;
    }

    @Override
    public void onMouseEvent(ComponentEvent event, Vec2 localLocation) {
        if(event == ComponentEvent.MouseClicked){
            state = state == LightState.off ? LightState.on : LightState.off;
        }

    }

    @Override
    public void draw(CeWindow window, Vec2 offset) {
        position.setOffset(offset);

        window.rectMode(PApplet.CORNER);
        if(state == LightState.on){
            window.fill(255,255,100);
        }else{
            window.fill(10,10,10);
        }
        if(state == LightState.notConnected){
            window.stroke(255,0,0);
        }else{
            window.stroke(0,0,0);
        }

        window.strokeWeight(2);
        window.rect(position.x(), position.y(),position.width(),position.height());
    }

    private enum LightState{
        notConnected,
        off,
        on
    }
}
