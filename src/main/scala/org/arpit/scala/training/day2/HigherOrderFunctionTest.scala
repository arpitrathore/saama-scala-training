package org.arpit.scala.training.day2

object HigherOrderFunctionTest {

  def addFive(value: Int): Int = value + 5
  
  def divideByTwo(value: Int): Double = value.toDouble / 2
  
  def isEven(value: Int): Boolean = value % 2 == 0
  
  def processRange(start: Int, finish: Int, processor: Int => AnyVal): Unit = {

    for (i <- start to finish) {
      println(processor(i))
    }
  }
  
  def main(args: Array[String]): Unit = {
    processRange(1, 5, addFive)
    processRange(1, 4, divideByTwo)
    processRange(1, 6, isEven)
  }
  
}