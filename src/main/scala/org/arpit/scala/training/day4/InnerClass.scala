package org.arpit.scala.training.day4

object InnerClass {

  def main(args: Array[String]): Unit = {
    val oc1 = new OuterClass
    val oc2 = new OuterClass

    val ic1 = new oc1.InnerClass
    val ic2 = new oc1.InnerClass

    ic1.x = 10
    ic2.x = 20

    println(ic1.x)
    println(ic2.x)
  }
}

class OuterClass {

  class InnerClass {
    var x = 1
  }

}