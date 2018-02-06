void setup() {
  Product[] producten = new Product[]{new Product ("pc", 500), new Product ("mac", 2000)};
  for (int i = 0; i < producten.length; i++ ) {
    println(producten[i].naam + " kost: " + producten[i].prijs + " euro");
  }
}

class Product {
  String naam;
  double prijs;



  Product(String productNaam, double productPrijs) {
    this.naam =  productNaam;
    this.prijs = productPrijs;
  }
}