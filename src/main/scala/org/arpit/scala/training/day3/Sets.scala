package org.arpit.scala.training.day3

//Run in REPL
object Sets {

  //Using Set (Immutable by default)
  var fruits = Set("Apple", "Mango")
  fruits = fruits + "Strawberry"
  fruits += "Banana"
  fruits.contains("Grapes")

  //Using mutable Set
  val laptops = scala.collection.mutable.Set("Hp", "Lenovo")
  laptops += "Dell"

  //Common operations
  val nums = Set(1, 2, 3) //Creates an immutable set( nums.toString returns Set(1, 2, 3) )

  nums + 5 //Adds an element (returns Set(1, 2, 3, 5) )

  nums - 3 // Removes an element (returns Set(1, 2) )

  nums ++ List(5, 6) //Adds multiple elements (returns Set(1, 2, 3, 5, 6) )

  nums -- List(1, 2) //Removes multiple elements (returns Set(3) )

  nums & Set(1, 3, 5, 7) //Takes the intersection of two sets (returns Set(1, 3) )

  nums.size //Returns the size of the set (returns 3 )

  nums.contains(3) //Checks for inclusion (returns true )

  import scala.collection.mutable

  //Makes the mutable collections easy to access Creates an empty, 
  //mutable set ( words.toString returns Set() )
  val words = mutable.Set.empty[String]

  words += "the" //Adds an element ( words.toString returns Set(the) )

  words -= "the" //Removes an element, if it exists ( words.toString returns Set() )

}