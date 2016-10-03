package org.arpit.scala.training.day4

object WithTypeTest {

  def main(args: Array[String]): Unit = {
    val stringStack = new EmptyStack[String].push("a").push("b").push("c")
    println(stringStack.top)

    val intStack = new EmptyStack[Int].push(101).push(102).push(103)
    println(intStack.top)

    val booleanStack = new EmptyStack[Boolean].push(true).push(false).push(true)
    println(booleanStack.top)
  }

}

abstract class Stack[T] {
  def push(x: T): Stack[T] = new NonEmptyStack[T](x, this)
  def isEmpty: Boolean
  def top: T
  def pop: Stack[T]
}

class EmptyStack[T] extends Stack[T] {
  def isEmpty = true
  def top = sys.error("EmptyStack.top")
  def pop = sys.error("EmptyStack.pop")
}

class NonEmptyStack[T](elem: T, rest: Stack[T]) extends Stack[T] {
  def isEmpty = false
  def top = elem
  def pop = rest
}