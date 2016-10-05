package org.arpit.scala.training.day2

object Extractor2 {
  def main(args: Array[String]): Unit = {
    //Extractor for case class
    var Mobile(i, p) = Mobile("123456", 15000)
    println(i)
    println(p)

    //Extractor for tuples
    val (id, name) = (1, "Arpit")
    println(id)
    println(name)
  }
}

case class Mobile(imei: String, price: Int)