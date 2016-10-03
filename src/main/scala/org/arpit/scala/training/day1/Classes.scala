package org.arpit.scala.training.day1

object Classes {

  def main(args: Array[String]) {
    val pt = new Point(1, 2)
    println(pt)
    
    pt.move(10, 10)
    println(pt)
  }
}

class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  
  override def toString: String =
    "(" + x + ", " + y + ")"
}