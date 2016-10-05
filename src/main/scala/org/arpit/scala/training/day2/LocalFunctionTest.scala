package org.arpit.scala.training.day2

import scala.io.Source
import java.io.InputStream

//Also called nested function
object LocalFunctionTest {
  def main(args: Array[String]): Unit = {
    LongLinesWithLocalFunctions.processFile("/scala_wiki.txt", 90);
  }
}

object LongLinesWithLocalFunctions {

  def processFile(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length < width) {
        println(line)
      }
    }

    val stream: InputStream = getClass.getResourceAsStream(filename)
    val source = scala.io.Source.fromInputStream(stream)
    for (line <- source.getLines()) {
      processLine(line)
    }

  }
}
