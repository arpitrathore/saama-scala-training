package org.arpit.scala.training.comparison.day1

object ClassTest {

  def main(args: Array[String]): Unit = {
    val classJava = new ClassJava(1, "Java")
    val classScala = new ClassScala(2, "Scala")
    
    println(classJava.toString())
    println(classScala.toString())
  }

}