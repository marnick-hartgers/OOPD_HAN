void setup(){
  int[] dataA = new int[]{1,2,3,4,5};
  int[] dataB = new int[]{1,7,4,4,4,6,7};
  println("=====Opgave A=====");
  printArray(telElementenOp(dataA, dataB));
  println("=====Opgave B=====");
  printArray(maakMaxArray(dataA, dataB));
  
  //Volgende regel is optiöneel
  exit();
}

void draw(){
  
}

int[] telElementenOp (int[] a, int[] b){
  int[] resultaat = new int[max(a.length, b.length)];
  
  for(int i = 0; i< resultaat.length;i++){
    if(i < a.length){
      resultaat[i] += a[i];
    }
    if(i < b.length){
      resultaat[i] += b[i];
    }
  }
  
  return resultaat;
}

int[] maakMaxArray (int[] a, int[] b){
  int[] resultaat = new int[max(a.length, b.length)];
  
  for(int i = 0; i< resultaat.length;i++){
    if(i < a.length && i < b.length){
      resultaat[i] = max(a[i], b[i]);
    }else if(i < a.length){
      resultaat[i] = a[i];
    }else if(i < b.length){
      resultaat[i] = b[i];
    }
  }
  
  return resultaat;
}