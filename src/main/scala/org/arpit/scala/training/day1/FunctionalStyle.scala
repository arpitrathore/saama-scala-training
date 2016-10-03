package org.arpit.scala.training.day1

object FunctionalStyle {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val sumAll = totalFunctional(numbers, e => true)
    println(sumAll)

    println(totalFunctional(numbers, e => e % 2 == 0))
    println(totalFunctional(numbers, _ > 4))
  }

  def totalFunctional(list: List[Int], selector: Int => Boolean) = {
    var sum = 0
    list.foreach { e => if (selector(e)) sum += e }
    sum
  }
}