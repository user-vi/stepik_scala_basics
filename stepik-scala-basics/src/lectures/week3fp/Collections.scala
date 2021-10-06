package lectures.week3fp

object Collections extends App {

  val fruits = List("apple", "banana")

  val mapResult = fruits.map(_.toUpperCase)
  val flatResult = fruits.flatMap(_.toUpperCase)

  println(mapResult) // List(APPLE, BANANA)
  println(flatResult) // List(A, P, P, L, E, B, A, N, A, N, A)

  val s = "Hello"
  val newStr: String = s.flatMap(c => (c + "."))
  println(newStr) // H.e.l.l.o.

  println(s.map(c => (c + "."))) // ArraySeq(H., e., l., l., o.)

}
