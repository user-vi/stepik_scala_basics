package exercises.LogSystem

import scala.annotation.tailrec

object Logger extends App {
  val logger = new Logger
  logger.info.print
  logger.info(3).print
  logger.info.info.info.print

//
//  val logger2 = new Logger
//  logger2.info.print
//  logger2.info.info.info.print
//  logger2.info.info.info.print
}

class Logger(val msgNum: Int = 0) {
  def info():Logger = {
    println("INFO New Message")
    new Logger(msgNum + 1)
  }

//  перегрузка метода
  def info(n:Int):Logger = {
    @tailrec
    def loop(n:Int, logger: Logger):Logger = {
      if (n < 1) logger
      else loop(n - 1, logger.info())
    }
    loop(n, this)
  }

  def print: Unit = println(msgNum)

}




