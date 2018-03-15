package com.code_envolved.ui.component;

import com.code_envolved.ui.Models.Vec2;

public interface ICeMouseEventReaction {
    void onReacionAdded(ICeUiComponent comp);
    void clicked(Vec2 localLocation);
}
