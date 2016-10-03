package org.arpit.scala.training.day2

//Run in REPL
object FirstClassFunctionTest {
  
  //Function literal
  (x: Int) => (x + 1)
  
  //Function literal stored in variable
  var increase = (x: Int) => (x + 1)
  
  //New definition of var increase
  increase = (x: Int) => x + 9999
  
  //Function literal with a block
  increase = (x: Int) => {
    println("We")
    println("are")
    println("here!")
    x + 1
  }
  
  //Apply function literal to each element of list
  val list = List(1, 2, 3, 4, 5)
  list.foreach((x: Int) => println(x))
  
  //Filter the list using predicate function
  list.filter((x: Int) => x>3 )
  
  //Shorter version
  list.filter(x => x > 3)
  
  //Placeholder syntax
  list.filter(_ > 3)
  
  //Map - Applies the function to each element of a collection and returns a new collection
  list.map(_*2)
}