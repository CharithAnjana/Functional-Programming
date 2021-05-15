object Q2 extends App {

  def vol(r: Double):Double = {
    var pi: Double = 22 / 7.0;
    var v: Double = (4/3.0) *pi *r *r *r;

    return v - (v % .01);
  }

  println(vol(5));
}
