package org.arpit.scala.training.comparison.day1

object MapScala {

  def main(args: Array[String]): Unit = {
    val keywords = List("BlackBerry", "Apple", "Avocado", "Mango", "Beet", "Banana")
    val result = keywords.sorted.groupBy(_.head)
    println(result)
  }
}