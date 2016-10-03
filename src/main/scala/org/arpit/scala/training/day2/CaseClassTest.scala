package org.arpit.scala.training.day2

case class Employee(id: Int, name: String, salary: Double)

object CaseClassTest {

  def main(args: Array[String]): Unit = {
    val e1 = Employee(1, "Arpit", 10000)
    val e2 = Employee(2, "Mohan", 10000)
    val e3 = Employee(1, "Arpit", 10000)

    //e1.id = 2 Doesn't compile

    //natural implementation of method toString
    println(e1)

    //natural implementation of method equals
    println(e1 == e2)
    println(e1 == e3)

    println(e1.hashCode())

  }

}

