package org.arpit.scala.training.day1

abstract class AbsInfo {
  def isSpecialTrain: Boolean
}

trait MyTrain {
  def printTrainInfo = {
    println("Train Number : 12130")
    println("Train Name : Azad hind express")
  }
}

class GeneralQuota {
  def printQuotaDetail = println("General Quota")
}

class TatkalQuota extends AbsInfo {
  def printQuotaDetail = println("Tatkal Quota")
  def isSpecialTrain: Boolean = false
}

//The LadiesQuota class is constructed from a mixin composition of the parents AbsInfo 
//and MyTrain with the keyword with. The first parent is called the 
//abstract class of LadiesQuotaclass, whereas the second 
//(and every other, if present) parent is called a mixin.
class LadiesQuota extends AbsInfo with MyTrain {
  def printQuotaDetail = println("Ladies Quota")
  def isSpecialTrain: Boolean = false
}

object Mixins {

  def main(args: Array[String]): Unit = {
    val gQuota = new GeneralQuota
    gQuota.printQuotaDetail

    val tQuota = new TatkalQuota
    tQuota.printQuotaDetail
    println("Is it Special train : " + tQuota.isSpecialTrain)

    val lQuota = new LadiesQuota
    lQuota.printQuotaDetail
    println("Is it Special train : " + lQuota.isSpecialTrain)

    lQuota.printTrainInfo
  }
}