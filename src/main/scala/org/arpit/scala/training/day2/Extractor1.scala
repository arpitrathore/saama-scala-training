package org.arpit.scala.training.day2

object Extractor1 {

  def main(args: Array[String]): Unit = {
    //Use of apply
    val result = Fraction(3, 4) * Fraction(2, 5)
    println(result)

    //Use of unapply
    var Fraction(a, b) = Fraction(3, 4) * Fraction(2, 5)
    println(a)
    println(b)
  }
}

class Fraction(var num: Int, var den: Int) {

  def *(that: Fraction) = new Fraction(this.num * that.num, this.den * that.den)

  override def toString = num + "/" + den
}

object Fraction {

  def apply(num: Int, den: Int) = new Fraction(num, den)

  def unapply(input: Fraction) = {
    if (input.den == 0) None else Some((input.num, input.den))
  }
}
