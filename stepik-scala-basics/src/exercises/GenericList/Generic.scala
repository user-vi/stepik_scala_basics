package exercises.GenericList

import java.util.NoSuchElementException

import scala.annotation.tailrec


/*
object Generic extends App {
//  val log = new Log("m1", new Log("m2", new Log("m3", Empty)))
//  println(log.all())
//
//  val list = new Log("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))
//  println(list.previous.last)

  val intLogs: LogList[Int] = Empty
  val strLogs: LogList[String] = Empty

}


//LogList(тут указаны требуемые нам методы)
abstract class LogList[+A] {

  //  last - возвращает последнее поступившее сообщение (иначе говоря - head списка)
  def last():String

  //  previous - возвращает все ранее поступившие собщения(это будет tail или хвост списка),
  //  за исключением самого последнего (т.е. за исключением head)
  def previous():LogList[A]

  //  isEmpty - проверяет, если ли в нашем списке сообщения
  def isEmpty():Boolean

  //  all - предоставляет нам содержимое нашего списка в виде строки
  def all():String

  //  add(msg) - добавляет сообщение в список
  def add[](msg:String): LogList[A]

}


//Log (хранит описание методов для непустого списка)
class Log[T >: LogList](head:String, tail:LogList[T]) extends LogList[T] {

  override def add(msg:String) = new Log(msg, this)

  override def isEmpty(): Boolean = false

  override def all(): String = {
    @tailrec
    def loop(logList: LogList[A], acc:String = ""): String={
      if (logList.isEmpty()) acc
      else loop(logList.previous(), s"$acc${logList.last()} ")
    }
    loop(this)

  }

  override def last(): String = this.head

  override def previous(): LogList[A] = this.tail

}


//Empty (описывает методы для пустого списка)
object Empty extends LogList[Nothing](){

  override def add(msg:String): LogList[Nothing] = new Log(msg, Empty)

  override def previous(): LogList[Nothing] = throw new NoSuchElementException

  override def last(): String = throw new NoSuchElementException

  override def all(): String = ""

  override def isEmpty(): Boolean = true

}
*/
