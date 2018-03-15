package com.code_envolved;

import com.code_envolved.ui.CeWindow;
import com.code_envolved.ui.Models.Rectangle;
import com.code_envolved.ui.Models.Vec2;
import processing.core.PApplet;

public class GraphicsEngineApp extends CeWindow {

    public static void run(){
        PApplet.main(GraphicsEngineApp.class);
    }

    public GraphicsEngineApp(){
        super(new Vec2(600,400));
        TestButton b = new TestButton(new Rectangle(10,10,50,50));
        this.addComponent(b);
        TestLight l = new TestLight(new Rectangle(15,5,20,20));
        b.addMouseEventReaction(l);
        b.addChild(l);

    }

}
