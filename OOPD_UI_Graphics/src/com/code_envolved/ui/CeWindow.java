package com.code_envolved.ui;

import com.code_envolved.ui.Models.Vec2;
import com.code_envolved.ui.component.events.ComponentEvent;
import com.code_envolved.ui.component.ICeUiComponent;
import processing.core.PApplet;
import processing.event.MouseEvent;

import java.util.ArrayList;

public abstract class CeWindow extends PApplet {

    private Vec2 _windowsSize;
    private ArrayList<ICeUiComponent> _components = new ArrayList<>();

    public CeWindow(Vec2 size){
        _windowsSize = new Vec2(size);
    }

    public CeWindow(){
        _windowsSize = new Vec2(200);
    }

    protected void addComponent(ICeUiComponent comp){
        _components.add(comp);
    }

    public void setup(){

    }

    public void draw(){

        for(ICeUiComponent c : _components){
            c.draw(this, new Vec2());
        }
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        for(ICeUiComponent c : _components){
            c.processMouseEvent(ComponentEvent.MouseClicked, new Vec2(mouseX, mouseY));
        }
    }

    @Override
    public void mousePressed() {
        for(ICeUiComponent c : _components){
            c.processMouseEvent(ComponentEvent.MouseDown, new Vec2(mouseX, mouseY));
        }
    }

    @Override
    public void mouseReleased() {
        for(ICeUiComponent c : _components){
            c.processMouseEvent(ComponentEvent.MouseUp, new Vec2(mouseX, mouseY));
        }
    }

    public void settings(){
        size((int)_windowsSize.x(), (int)_windowsSize.y());
        loop();
    }


}
