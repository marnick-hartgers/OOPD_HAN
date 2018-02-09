Damsteen[] stenen = new Damsteen[4];
void setup() {
  stenen[0] = new Damsteen(20.0, 20.0, 10.0, 0, 0, 0);
  stenen[1] = new Damsteen(40.0, 20.0, 10.0, 255, 255, 255);
  stenen[2] = new Damsteen(20.0, 40.0, 10.0, 255, 255, 255);
  stenen[3] = new Damsteen(40.0, 40.0, 10.0, 0, 0, 0);
}

void draw() {
  for (Damsteen steen : stenen) {
    Color kleur = steen.kleur;
    fill(kleur.r, kleur.g, kleur.b );
    noStroke();
    ellipse(steen.x, steen.y, steen.radius, steen.radius);
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