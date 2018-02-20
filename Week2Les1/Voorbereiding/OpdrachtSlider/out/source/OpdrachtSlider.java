import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OpdrachtSlider extends PApplet {

Slider s1;

public void setup(){
    
    s1 = new Slider();
}

public void draw(){
    s1.draw();
}
class Rectangle {
  Vec2 pos;
  Vec2 size;  
  
  Rectangle(){}  
  Rectangle(Vec2 pos, Vec2 size){
    this.pos = pos;
    this.size = size;
  }
  Rectangle(float x, float y, float sx, float sy){
    this.pos = new Vec2(x,y);
    this.size = new Vec2(sx,sy);
  }


  public boolean isInRect(float x, float y){
    return constrain(x, this.pos.x, this.pos.x + this.size.x) == x && constrain(y, this.pos.y, this.pos.y + this.size.y) == y;
  }


  
}
class Slider{
    private Rectangle bounds;
    private int numSteps = 5;
    private float value = 0;
    private boolean isActive = false;

    Slider(){
        this.bounds = new Rectangle(10.0f,10.0f,300.0f,50.0f);
    }

    Slider(float x, float y, float sx, float sy, int numSteps){
        this.bounds = new Rectangle(x,y,sx,sy);
        this.numSteps = numSteps;
    }

    private float bepaalValue(){
        float xOffset = bounds.pos.getOffset(mouseX, mouseY).x;
        println(xOffset);
        return xOffset;
    }

    public void handleMouse(){
        if(!mousePressed){
            this.isActive = false;
        }
        else if(mousePressed && bounds.isInRect(mouseX, mouseY) && isActive == false){
            this.isActive = true;
        }   

        if(isActive){
            this.value = bepaalValue();
        }
    }

    public void draw(){
        fill(0);
        rect(bounds.pos.x,bounds.pos.y, bounds.size.x,bounds.size.y);
    }

}
class Vec2{
  float x;
  float y;
  
  Vec2(){}
  Vec2(float x, float y){
    this.x = x;
    this.y = y;
  }
  
  public Vec2 getOffset(float x, float y){
    return new Vec2(x - this.x, y - this.y);
  }

}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OpdrachtSlider" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
