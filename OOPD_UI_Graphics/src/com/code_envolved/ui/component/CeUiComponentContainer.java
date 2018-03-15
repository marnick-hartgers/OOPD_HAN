package com.code_envolved.ui.component;

import com.code_envolved.ui.CeWindow;
import com.code_envolved.ui.Models.Rectangle;
import com.code_envolved.ui.Models.Vec2;

import java.util.ArrayList;

public abstract class CeUiComponentContainer extends CeUiComponent {

    protected ArrayList<ICeUiComponent> _childs = new ArrayList<>();

    public CeUiComponentContainer(){
    }

    public CeUiComponentContainer(Rectangle position){
       super(position);
    }

    public void addChild(ICeUiComponent com){
        _childs.add(com);
    }

    public void removeChild(ICeUiComponent com){
        _childs.remove(com);
    }

    @Override
    public void draw(CeWindow window, Vec2 parentOffset) {
        position.setOffset(parentOffset);

        for(ICeUiComponent c : _childs){
            c.draw(window, position.getAbsolutePosition());
        }
    }
}
