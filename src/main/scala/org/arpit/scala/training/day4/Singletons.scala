package org.arpit.scala.training.day4

object Singletons {
  
}

class Employee(id:Int, name:String, salary : Double)

object Employee {
  
  def apply(id:Int, name:String, salary : Double) = new Employee(id, name, salary)
  def defaultEmployee = new Employee(1, "Test", 100.00)
  
  
}