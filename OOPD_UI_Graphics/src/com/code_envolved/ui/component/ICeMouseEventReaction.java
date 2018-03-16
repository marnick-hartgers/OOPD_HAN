package com.code_envolved.ui.component;

import com.code_envolved.ui.Models.Vec2;
import com.code_envolved.ui.component.events.ComponentEvent;

public interface ICeMouseEventReaction {
    void onReacionAdded(ICeUiComponent comp);
    void onMouseEvent(ComponentEvent event, Vec2 localLocation);
}
