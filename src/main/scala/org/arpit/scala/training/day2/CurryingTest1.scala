package org.arpit.scala.training.day2

object CurryingTest1 {
  
  def plainOldSum(x: Int, y: Int) = x + y
  plainOldSum(3, 4)
  
  def curriedSum(x: Int)(y: Int) = x + y
  curriedSum(3)(4)
  
  //The underscore is a placeholder for the second parameter list
  val add3 = curriedSum(3)_
  add3(4)
  
}