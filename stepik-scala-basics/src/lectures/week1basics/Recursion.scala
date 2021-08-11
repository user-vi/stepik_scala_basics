package lectures.week1basics

import scala.annotation.tailrec

object Recursion extends App {
//  def repeatWord(word: String, n: Int): String = {
//    @tailrec
//    def loop(i: Int, acc: String = word): String = {
//      if (i <= 1) acc
//      else loop(i - 1, s"$word $acc")
//    }
//
//    loop(n)
//  }
//
//  println(repeatWord("hi", 4))

//  to count power of two
//  def powerOfTwo(i: Int): BigInt = {
//
//    @tailrec
//    def loop(i: Int, acc:BigInt = 1): BigInt = {
//      if (i < 1) acc
//      else loop(i-1, 2 * acc)
//    }
//    loop(i)
//  }


//    val x = 10
//    val y = 1
//    val n = 5
//
//    @tailrec
//    def loop(n: Int, acc: Int = x, y: Int = y): Int = {
//      if (n < 1) acc
//      else loop(n - 1, y + acc)
//    }
//    val result = loop(n).toString
//    val len = result.length
//
//    def loop_for_print(len:Int, acc:String = "is the result", result:String = result): String = {
//      if (len < 1) acc
//      else loop_for_print(len - 1, s"$result $acc")
//    }
//    println(loop_for_print(len))

    def word(sentence: String = "I like Scala"): Unit = {
        val arr:Array[String] = sentence.split("\\w+")
        val len = arr.length

//        @tailrec
//        def loop(len:Int, arr:List[String]):String  = {
//            if (len <= 1) arr(len)
//            else loop(len-1, arr)
//        }
        println(arr(0))

    }
}



