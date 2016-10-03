package org.arpit.scala.training.day4

object SequenceComprehensions {

  //With foreach
  for (i <- 1 to 10) println(i)
  (1 to 10).foreach(i => println(i))

  //With map
  for (i <- 1 to 10) yield i * i
  (1 to 10).map(i => i * i)

  //Filter
  for (i <- 1 to 10 if i % 2 == 0) yield i
  (1 to 10).filter(_ % 2 == 0)
}