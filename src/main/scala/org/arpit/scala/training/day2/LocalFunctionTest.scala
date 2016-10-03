package org.arpit.scala.training.day2

import scala.io.Source

//Also called nested function
object LocalFunctionTest {
  def main(args: Array[String]): Unit = {
    LongLinesWithLocalFunctions.processFile("/home/arathore/scala_wiki.txt", 15);
  }
}

object LongLinesWithLocalFunctions {

  def processFile(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length > width) {
        println(filename + ": " + line)
      }
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines()) {
      processLine(line)
    }

  }
}
