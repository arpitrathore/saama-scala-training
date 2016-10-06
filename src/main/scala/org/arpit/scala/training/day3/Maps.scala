package org.arpit.scala.training.day3

object Maps {

  //Using maps
  val romanNumeral = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")

  //Using mutable maps
  val map = scala.collection.mutable.Map.empty[String, Int]
  map("hello") = 1
  map("there") = 2

  //Common Operations
  val nums = Map("i" -> 1, "ii" -> 2)
  //Creates an immutable map(nums.toString returns Map(i -> 1, ii -> 2) )

  nums + ("vi" -> 6)
  //Adds an entry (returns Map(i -> 1, ii -> 2, vi -> 6) )

  nums - "ii"
  //Removes an entry (returns Map(i -> 1) )

  nums ++ List("iii" -> 3, "v" -> 5)
  //Adds multiple entries (returns Map(i -> 1, ii -> 2, iii -> 3, v -> 5) )

  nums -- List("i", "ii")
  //Removes multiple entries (returns Map() )

  nums.size
  //Returns the size of the map (returns 2 )

  nums.contains("ii")
  //Checks for inclusion (returns true )

  nums("ii")
  //Retrieves the value at a specified key (returns 2 )

  nums.keys
  //Returns the keys (returns an Iteratable over the strings "i" and "ii" )

  nums.keySet
  //Returns the keys as a set (returns Set(i, ii) )

  nums.values
  //Returns the values (returns an Iterable over the integers 1 and 2 )

  nums.isEmpty
  //Indicates whether the map is empty (returns false)

  import scala.collection.mutable
  //Makes the mutable collections easy to access

  val words = mutable.Map.empty[String, Int]
  //Creates an empty, mutable map

  words += ("one" -> 1)
  //Adds a map entry from "one" to 1 ( words.toString returns Map(one -> 1) )

  words -= "one"
  //Removes a map entry, if it exists ( words.toString returns Map() )

  words ++= List("one" -> 1, "two" -> 2, "three" -> 3)
  //Adds multiple map entries ( words.toString returns Map(one -> 1, two -> 2, three -> 3) )

  words --= List("one", "two")
  //Removes multiple objects ( words.toString returns Map(three -> 3) )
}