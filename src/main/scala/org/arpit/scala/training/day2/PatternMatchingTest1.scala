package org.arpit.scala.training.day2

object PatternMatchingTest1 {

  def main(args: Array[String]): Unit = {

    val ch: Char = '+'

    val sign = ch match {
      case '+' => 1
      case '-' => -1
      case _   => 0
    }

    println(sign)

  }

}