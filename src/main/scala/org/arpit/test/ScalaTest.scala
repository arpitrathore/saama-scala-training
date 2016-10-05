package org.arpit.test

case class Laptop(brand: String, screenSize: Double, price: Int)

object ScalaTest {

  def main(args: Array[String]): Unit = {
    val laptops = List(new Laptop("HP", 15.6, 25000),
      new Laptop("Dell", 14.1, 23000),
      new Laptop("Dell", 15.6, 29000),
      new Laptop("Apple", 15.6, 29000))

    for (l <- laptops) {
      l match {
        case Laptop("Dell", _, _) => println("Dell laptop")
        case Laptop("HP", _, _)   => println("HP")
        case _                    => println("Unknown laptop")
      }
    }
  }

}