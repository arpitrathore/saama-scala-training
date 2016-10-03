package org.arpit.scala.training.day1

trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}

class APoint(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc
  def isSimilar(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}

object Traits {

  def main(args: Array[String]): Unit = {
    val p1 = new APoint(2, 3)
    val p2 = new APoint(2, 4)
    val p3 = new APoint(3, 3)

    println(p1.isSimilar(p2))
    println(p1.isNotSimilar(p3))
    println(p1.isNotSimilar(2))
  }

}