String[] idLijst = {"8b3", "4bf", "9h0"};

void setup() {
  println(plakCodeVoorId(idLijst[0], "NL"));
  
  String[] resultaten = plakCodeVoorId(idLijst, "EN");
  for(int i=0;i<idLijst.length;i++){
    String verwachtRes = "EN" + idLijst[i];
    if(resultaten[i].equals(verwachtRes)){
      println("Test item " + i + " geslaagd");
    }else{
      println("Test item " + i + " faalt");
      println(verwachtRes);
      println(resultaten[i]);
    }
  }
  
}

String plakCodeVoorId(String id, String code) {
  return code + id;
}

String[] plakCodeVoorId(String[] lijst, String code){
  String[] newList = new String[lijst.length];
  
  for(int i=0;i<lijst.length;i++){
    newList[i] = plakCodeVoorId(lijst[i], code );
  }
  
  return newList;
}