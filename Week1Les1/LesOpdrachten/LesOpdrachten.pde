void setup() {
  //===== Opdracht Delen======//
  println("=====Getallen Delen=====");
  println("Delen: 5 & 2");
  println(floatDelen(5, 2));

  for (int i=0; i < 10; i++) {
    int a = 20 - i;
    float b = 2.5 * i;
    println("Delen: " + a + " & " + b);
    println(floatDelen(a, b));
  }
  println("Delen: 5 & 0");
  println(floatDelen(5, 0));


  //=====Opdracht Zoeken in array=====//
  println("\n\n=====Zoeken in array=====");
  int[] zWaardes = new int[]{0, 1, 2, 3, 5, 7, 9};
  println("Waardes met deze opdracht:");
  printArray(zWaardes);
  for (int i=0; i<10; i++) {
    print("Controleer " + i + ": ");
    println(zoekenInIntArray(zWaardes, i));
  }


  //=====Opdracht doeFunctie? =====//
  int[][] hetVeld = {
    {1, 6, 3}, 
    {3, 2, 9}, 
  };
  printArray(hetVeld);
  for (int y =0; y<hetVeld.length; y++) {
    print("Testen met: " + y);
    println(doeFunctie(hetVeld, y));
  }
  //Het volgende Stuk maakt een IndexOutOfRangeExeption
  try{
    println("Testen met: 2. Deze waarde is buiten het berijk van de array");
    println(doeFunctie(hetVeld, 2));
  }catch(Exception error){
    println(error);
  }
  
}

void draw() {
}

float floatDelen(float a, float b) {
  return a / b;
}

boolean zoekenInIntArray(int[] array, int waarde) {
  for (int i=0; i< array.length; i++) {
    if (array[i] == waarde) {
      return true;
    }
  }
  return false;
}

//Gekopieerd van de opdracht document 
int doeFunctie(int[][] a, int b) {
  int c = 0;
  int[] d = a[b];
  for (int i = 0; i < d.length; i++) {
    c += d[i];
  }  
  return c;
}