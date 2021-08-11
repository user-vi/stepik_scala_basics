package lectures.week1basics

object StringOperations extends App {
  val aString: String = "Hello, world!"

//  println(aString.length) // выводит 13
//  println(aString.charAt(1)) // выводит e
//  println(aString.substring(0, 2)) // выводит He
//  println(aString.split(" ").toList) // выводит List(Hello,, world!)
//  println(aString.startsWith("He")) // выводит true
//  println(aString.replace("!", ".")) // выводит Hello, world.
//  println(aString.toLowerCase) // выводит hello, world!
//  println(aString.toUpperCase) // выводит HELLO, WORLD!
//  println("abcd".reverse) // выводит dcba
//  println("abcd".take(2)) // выводит ab, числа должны быть положительными -1 не работает


  println(1 +: List(2, 3)) // List(1, 2, 3)
  println(List(1, 2) ++ List(3, 4)) // List(1, 2, 3, 4)
  println(List(1, 2) +: List(3, 4)) //List(List(1, 2), 3, 4)
}
