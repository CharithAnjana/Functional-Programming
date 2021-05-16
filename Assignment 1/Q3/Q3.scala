object Q3 extends App {

  def cost(c: Int): Double = {
    var price: Double = c * (24.95) * (60/100.0) + 3;

    if(c > 50){
      price += (c - 50) * 0.75;
    }

    return price - (price % .01);
  }

  println(cost(60));
}
