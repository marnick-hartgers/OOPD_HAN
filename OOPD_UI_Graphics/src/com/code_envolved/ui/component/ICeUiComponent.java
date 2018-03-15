package com.code_envolved.ui.component;

import com.code_envolved.ui.CeWindow;
import com.code_envolved.ui.Models.Vec2;
import com.code_envolved.ui.component.events.ComponentEvent;

public interface ICeUiComponent {
    void processMouseEvent(ComponentEvent event, Vec2 location);
    void draw(CeWindow window, Vec2 parentOffset);
}
