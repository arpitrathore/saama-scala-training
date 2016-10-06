package org.arpit.test

case class Laptop(brand: String, screenSize: Double, price: Int)

object ScalaTest {

  def main(args: Array[String]): Unit = {
    
    val list = List.range(1, 11)
    
    list.reduceLeft(_ + _)
    
    
  }

}