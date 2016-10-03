package org.arpit.scala.training.collection

object ListObjectMethods {

  //Creating lists from their elements: List.apply
  List.apply(1, 2, 3)
  
  //Creating a range of numbers: List.range
  List.range(1, 10)
  List.range(1, 10, 3)
  
  //Creating uniform lists: List.fill
  //The fill method creates a list consisting of zero or more copies of the same element
  List.fill(5)('a')
  
  //Concatenating multiple lists: List.concat
  List.concat(List('a', 'b'), List('c'))

}