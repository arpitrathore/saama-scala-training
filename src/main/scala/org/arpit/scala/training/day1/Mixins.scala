package org.arpit.scala.training.day1

package MixinsPackage {
  trait Friend {
    val name: String
    def listen = println("I am " + name + " your friend")
  }

  class Human(val name: String) extends Friend
  class Animal(val name: String)
  class Dog(override val name: String) extends Animal(name) with Friend
  class Cat(override val name: String) extends Animal(name)

  object Mixins {

    def seekHelp(friend: Friend) = friend.listen

    def main(args: Array[String]): Unit = {

      val rahul = new Human("Rahul")
      rahul.listen
      seekHelp(rahul)

      val rocky = new Dog("Rocky")
      rocky.listen
      seekHelp(rocky)

      val fluffy = new Cat("Fluffy")
      //fluffy.listen
      //seekHelp(fluffy)

      val snowy = new Cat("Snowy") with Friend
      snowy.listen
      seekHelp(snowy)
    }
  }
}
