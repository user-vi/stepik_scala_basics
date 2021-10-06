package exercises.Connection


object Main extends App {

}


//abstract class Connection_abs {
//  def connect()
//}

class Connection {
  def connect(): Unit = {
    s"Connected"
  }
}

object Connection {
  def apply(): Option[Connection] = {
    
  }
}
