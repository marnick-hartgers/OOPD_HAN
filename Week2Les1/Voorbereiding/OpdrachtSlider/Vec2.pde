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