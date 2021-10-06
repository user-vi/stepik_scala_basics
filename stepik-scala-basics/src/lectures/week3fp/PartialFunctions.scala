package lectures.week3fp

object PartialFunctions extends App {
  val matching: PartialFunction[String, String] = {
    case "hello" => "Hi, I'm Bot"
    case "bye" => "Bye-bye"
    case "what's up" => "sup-sup"
  }

  val chatbot = matching.lift

//  scala.io.Source.stdin.getLines().foreach(line => println(chatbot(line)))

//  scala.io.Source.stdin.getLines().map(chatbot).foreach(println)

  def compare(v1: String, v2: String): Int = {
    val arr1:Array[Int] = v1.split(".").map(_.toString.toInt)
    val arr2:Array[Int] = v2.split(".").map(_.toString.toInt)

    val n = if (arr1.length > arr2.length) arr1.length else arr2.length

    
  }


}





