package org.arpit.scala.training.day2

import scala.io.Source

object MethodTest {

  def main(args: Array[String]): Unit = {
    LongLines.processFile("/home/arathore/scala_wiki.txt", 15);
  }
}

object LongLines {

  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)

    for (line <- source.getLines()) {
      processLine(filename, width, line)
    }
  }

  private def processLine(filename: String, width: Int, line: String) {
    if (line.length > width) {
      println(filename + ": " + line.trim)
    }
  }
}