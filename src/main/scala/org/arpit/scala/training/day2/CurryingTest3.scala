package org.arpit.scala.training.day2

object CurryingTest3 {

  def main(args: Array[String]): Unit = {

    def simpleInterestNormal = simpleInterest(10) _
    def simpleInterestSenior = simpleInterest(12) _

    println(simpleInterestNormal(10000)(2))
    println(simpleInterestSenior(10000)(2))
  }

  def simpleInterest(r: Float)(p: Int)(n: Int) = {
    r * p * n
  }

}