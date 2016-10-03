package org.arpit.scala.training.day2

object CurryingTest2 {

  def courseAverage(tests: Int*)(assgns: Int*)(quizzes: Int*) = {
    0.4 * tests.sum / tests.length + 
    0.4 * assgns.sum / assgns.length + 
    0.2 * quizzes.sum / quizzes.length
  }
  
  def main(args: Array[String]): Unit = {
    val average = courseAverage(90,80,70,95,98)(70,85,75)(92)
    println(average)
  }
}