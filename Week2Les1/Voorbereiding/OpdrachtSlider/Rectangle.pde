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