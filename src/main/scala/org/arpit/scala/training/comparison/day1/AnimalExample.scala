package org.arpit.scala.training.comparison.day1

object AnimalExample {
  def main(args: Array[String]): Unit = {
    val animals = List(new Dog, new Cat, new Bear)
    animals.foreach(_.makeSound())
  }
}

trait Animal {
  def makeSound(): Unit
}

class Dog extends Animal {

  override def makeSound() = {
    println("Bark!")
  }
  
  def doSomething(x:Int, y:String) = {
    println("Bark!")
  }
}

class Cat extends Animal {

  override def makeSound() = {
    println("Meow!!")
  }
}

class Bear extends Animal {

  override def makeSound() = {
    println("Growl!!")
  }
}

