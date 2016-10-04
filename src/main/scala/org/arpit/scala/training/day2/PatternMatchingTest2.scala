package org.arpit.scala.training.day2

class Account
case class User(name: String, account: Account)
case class Paypal(email: String) extends Account
case class Bitcoin(key: String) extends Account

object PatternMatchingTest2 {
  def main(args: Array[String]): Unit = {

    val paypalUser = new User("Arpit", new Paypal("arpit@gmail.com"))
    println(whatis(paypalUser))
    
    val bitCoinUser = new User("Rahul", new Bitcoin("123456"))
    println(whatis(bitCoinUser))
    
    val unregisteredUser = new User("Sachin", null)
    println(whatis(unregisteredUser))
    
    println(whatis(12345))
  }

  def whatis(obj: Any) = {
    obj match {

      case User(name, Paypal(email)) =>
        "Paypal for email " + email

      case User(name, Bitcoin(key)) =>
        "Bitcoin with key " + key

      case User(name, _) =>
        "User with unknown account"

      case _ => "Unknown object type"
    }
  }
}