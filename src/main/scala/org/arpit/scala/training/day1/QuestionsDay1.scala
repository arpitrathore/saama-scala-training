package org.arpit.scala.training.day1

package day1 {

  //By default if you dont provide val or var, scala doesnt generate accessors/mutators
  //If you define val, only accessor methods are generated
  //If you define var, both accessor/mutator methods are generated 
  class Employee(id: Int, name: String) {
    
    def this() = {
      this(101, "Rahul")
      println("Inside default constructor")
    }
  }

}

object Day1Questions {

  def main(args: Array[String]): Unit = {
    val e1 = new day1.Employee(1, "Arpit")
    /*println(e1.id)
        e1.id = 2
        println(e1.id)*/

    val e2 = new day1.Employee()
  }

}

