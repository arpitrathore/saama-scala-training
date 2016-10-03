package org.arpit.scala.training.day1

object UnifiedTypes {

  def main(args: Array[String]): Unit = {

    val set = new scala.collection.mutable.LinkedHashSet[Any]
    set += "This is a string" // add a string
    set += 732 // add a number
    set += 'c' // add a character
    set += true // add a boolean value
    set += max _ // add the max function

    val iter: Iterator[Any] = set.iterator
    while (iter.hasNext) {
      println(iter.next.toString())
    }
  }

  //Very descriptive definition
  def max(x: Int, y: Int): Int = {
    if (x > y) {
      return x
    }
    return y
  }

}