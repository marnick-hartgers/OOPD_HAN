Damsteen[] stenen = new Damsteen[2];
void setup() {
  stenen[0] = new Damsteen(20.0, 20.0, 20.0, 0, 0, 0);
  stenen[1] = new Damsteen(40.0, 40.0, 20.0, 255, 255, 255);
}

void draw() {
  for (Damsteen steen : stenen) {
    steen.teken();
  }
}

class Damsteen {
  Damsteen(float x, float y, float radius, float r, float g, float b) {
    this. x = x;
    this.y = y;
    this.radius = radius;
    this.kleur = new Color(r, g, b);
  }
  float x;
  float y;
  Color kleur;
  float radius;
  boolean isGeselecteerd = true;

  void teken() {
    fill(this.kleur.r, this.kleur.g, this.kleur.b );
    if(this.isGeselecteerd){
      strokeWeight(3);
      stroke(#FF0000);
    }else{
      noStroke();
    }
    
    ellipse(this.x, this.y, this.radius, this.radius);
  }
}

class Color {
  Color(float r, float g, float b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }
  float r;
  float g;
  float b;
}