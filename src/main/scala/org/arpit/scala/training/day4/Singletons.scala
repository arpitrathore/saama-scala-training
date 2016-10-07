package org.arpit.scala.training.day4

object Singletons {
  def main(args: Array[String]): Unit = {
    //val e = new Employee(1, "Arpit", 1000.00)

    val e1 = Employee.getInstance
    println(e1.getId)
    
    Employee.doSomeStaticThing
  }
}

class Employee private (id: Int, name: String, salary: Double) {
  def getId = id
  override def toString = "(" + id + ", " + name + ", " + salary + ")"
}

object Employee {

  val employee = new Employee(1, "Arpit", 100.00)
  def getInstance = employee

  def doSomeStaticThing = println("Doing some static thing")
}