package org.arpit.scala.training.day4

object WithoutTypeTest {

  def main(args: Array[String]): Unit = {
    
    val intStack = new IntEmptyStack().push(1).push(2).push(3)
    println(intStack.top)
    println(intStack.pop.top)
  }
}

abstract class IntStack {
  def push(x: Int): IntStack = new IntNonEmptyStack(x, this)
  def isEmpty: Boolean
  def top: Int
  def pop: IntStack
}

class IntEmptyStack extends IntStack {
  def isEmpty = true
  def top = sys.error("EmptyStack.top")
  def pop = sys.error("EmptyStack.pop")
}

class IntNonEmptyStack(elem: Int, rest: IntStack) extends IntStack {
  def isEmpty = false
  def top = elem
  def pop = rest
}