void setup(){
  println("=====Getallen Delen=====");
  println("Delen: 5 & 2");
  println(floatDelen(5,2));
  
  for(int i=0; i < 10;i++){
    int a = 20 - i;
    float b = 2.5 * i;
    println("Delen: " + a + " & " + b);
    println(floatDelen(a,b));
  }
  println("Delen: 5 & 0");
  println(floatDelen(5,0));
  
  println("\n\n=====Zoeken in array=====");
  int[] zWaardes = new int[]{0,1,2,3,5,7,9};
  println("Waardes met deze opdracht:");
  printArray(zWaardes);
  for(int i=0;i<10; i++){
    print("Controleer " + i + ": ");
    println(zoekenInIntArray(zWaardes, i));
  }
  
}

void draw(){
  
}

float floatDelen(float a, float b){
  return a / b;
}

boolean zoekenInIntArray(int[] array, int waarde){
  for(int i=0; i< array.length;i++){
    if(array[i] == waarde){
      return true;
    }
  }
  return false;
}