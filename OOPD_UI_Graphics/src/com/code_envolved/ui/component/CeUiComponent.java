package com.code_envolved.ui.component;

import com.code_envolved.ui.Models.Rectangle;
import com.code_envolved.ui.Models.Vec2;
import com.code_envolved.ui.component.events.ComponentEvent;

import java.util.ArrayList;

public abstract class CeUiComponent implements ICeUiComponent{

    protected Rectangle position;

    public CeUiComponent(){
        position = new Rectangle(0,0,60,40);
    }

    public CeUiComponent(Rectangle position){
        this.position = position;
    }

    protected ArrayList<ICeMouseEventReaction> _mouseEventReactions = new ArrayList<>();

    @Override
    public void processMouseEvent(ComponentEvent event, Vec2 location) {
        checkMouse(event, location );
    }

    protected boolean isOnComponent(Vec2 pos){
        return position.isOnRect(pos);
    }

    private void checkMouse(ComponentEvent event, Vec2 location){
        if(isOnComponent(location)){
            mouseClicked(event,location.substract(position.getAbsolutePosition()));
        }
    }

    protected void mouseClicked(ComponentEvent event, Vec2 localLocation){
        for (ICeMouseEventReaction reaction : _mouseEventReactions){
            reaction.onMouseEvent(event, localLocation);
        }
    }

    public void addMouseEventReaction(ICeMouseEventReaction reaction){
        if(!_mouseEventReactions.contains(reaction)){
            _mouseEventReactions.add(reaction);
            reaction.onReacionAdded(this);
        }
    }

    public void removeMouseEventReaction(ICeMouseEventReaction reaction){
        if(_mouseEventReactions.contains(reaction)){
            _mouseEventReactions.remove(reaction);
        }
    }
}
