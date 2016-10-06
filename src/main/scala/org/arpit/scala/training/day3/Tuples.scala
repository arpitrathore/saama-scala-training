package org.arpit.scala.training.day3

object Tuples {

  def main(args: Array[String]): Unit = {
    val employee = (1, "Arpit", 15000.00)

    println(employee._1)
    println(employee._2)
    println(employee._3)

    val (id, name, salary) = employee
    println(id)
    println(name)
    println(salary)
  }

}