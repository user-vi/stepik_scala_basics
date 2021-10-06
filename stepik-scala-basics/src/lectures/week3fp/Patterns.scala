package lectures.week3fp

import scala.io.StdIn.readLine


object Patterns extends App {

  //константы
  val x: Any = "Scala" //тип Any для х разных типов
  val constants = x match {
    case 1 => "число"
    case "Scala" => "строка"
    case true => "булевое значение"
  }
  println(constants)

  //tuples
  val aTuple = (5,2)
  val matchATuple = aTuple match {
    case (1, 1) => "полное совпадение"
    case (something, 2) => s"я нашел $something"
  }

  println(matchATuple) // я нашел 5

  val nestedTuple = (1, (2, 3))
  val matchNestedTuple = nestedTuple match {
    case (_, (2, v)) => s"тут есть число $v"
  }

  println(matchNestedTuple) // тут есть число 3

  //lists
  val aStandardList = List(5, 4)
  val listMatching = aStandardList match {
    case List(1, _, _, _) => "список из 4 элементов, где первый элемент равен 1"
    case List(2, _*) => "список произвольной длины, где первый элемент равен 2"
    case List(3, 2, 1) :+ 0 => "список List(3, 2, 1, 0)"
    case 5 :: List(_) => "список, где первым идет число 5 и еще один элемент"
  }

  //unknown types
  val unknown: Any = List(1, 2  )
  val typeMatch = unknown match {
    case list: List[Int] => "list of INTs"
    case _ => "default"
  }

  println(typeMatch) // list of INTs

  //classes
  case class Person(name: String, age: Int)

  val bob = Person("Bob", 30)
  val greeting = bob match {
    case Person(n, a) if a < 18 => s"I'm $n and I'm under 18"
    case Person(n, a) => s"I'm $n and I am $a years old"
    case _ => "I have no name"
  }

  println(greeting) // I'm Bob and I am 30 years old

  //Name Binding
  val nameBindingMatch = List(6, 2) match {
    case nonEmptyList@List(1, _, _, _) => s"нашли $nonEmptyList"
    case someList@List(6, _*) => s"нашли список $someList"
  }

  println(nameBindingMatch) // нашли список List(6, 2)

  def guard(data:Any, maxLengt:Int):String = {
    data match{
      case list: List[Any] if list.length <= maxLengt => "Задан список List допустимой длины"
      case list: List[Any] if list.length > maxLengt => "Длина списка больше максимально допустимого значения"
      case str: String if str.length <= maxLengt => "Длина строки не превышает максимально допустимого значения"
      case str: String if str.length > maxLengt => "Получена строка недопустимой длины"
      case _ => "Что это? Это не строка и не список"
    }
  }
}

/*
object Main {
  val fullName:String = readLine()

  val person = Person(fullName)
  person match {
    case Person(name) => println(name)
    case _ => println("Oops, something is wrong")
  }
}
*/

object Person {
  def apply(fullName: String) = s"$fullName"

  def unapply(fullName: String): Option[String] = {
    val arr: Array[String] = fullName.split(" ")
    if (arr.tail.nonEmpty) Some(initialOfName(arr(0)) + initialOfName(arr(1))) else None
  }

  def initialOfName(name:String): String = name.charAt(0) + ". "

}