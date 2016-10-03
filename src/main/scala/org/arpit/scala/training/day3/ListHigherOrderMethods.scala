package org.arpit.scala.training.day3

object ListHigherOrderMethods {

  //Map
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  def addThree(x: Int): Int = {
    return x + 3
  }
  numbers.map(addThree)
  numbers.map(_ + 3)

  val words = List("My", "name", "is", "Arpit")
  words.map(_.length)
  words map (_.toList.reverse.mkString)
  
  //FlatMap
  /*The flatMap operator is similar to map , but it takes a function returning a list
  of elements as its right operand. It applies the function to each list element
  and returns the concatenation of all function results*/
  words.map(_.toList)
  words.flatMap(_ + 3)
  
  //Filter
  numbers.filter(_%2==0)
  words.filter(_.length > 2)
  
  //sortWith
  numbers.sortWith( _ > _ )
}