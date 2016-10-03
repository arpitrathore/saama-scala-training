package org.arpit.scala.training.day1

object ImperetiveStyle {

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(total(numbers))
    println(totalEven(numbers))
    println(totalOddGreaterThan5(numbers))
  }

  //To discuss immutability, return
  def total(list: List[Int]) = {
    var sum = 0
    for (i <- list) {
      sum += i
    }
    sum
  }

  def totalEven(list: List[Int]) = {
    var sum = 0
    //Another style
    list.foreach { e => if (e % 2 == 0) sum += e }
    sum
  }

  def totalOddGreaterThan5(list: List[Int]) = {
    var sum = 0
    list.foreach { e => if (e % 2 != 0 && e > 5) sum += e }
    sum
  }

}