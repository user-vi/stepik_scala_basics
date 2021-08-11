package lectures.week2oop

object SyntacticSugar extends App {
  val bob = new Person("Bob", "Developer")
  val alice = new Person("Alice", "Data Engineer")

//  println(bob.&(alice)) // точечная нотация
//  println(bob & alice) // инфиксная нотация
//
//  println(bob.apply())
//  println(bob()) // используется наболее часто

  val person = new Person("Bob")
  println((+person).name)


}

class Person(val name: String, occupation: String) {
  def this(name: String) = this(name, "NoJob")

  def worksAs(jobName: String): Boolean = jobName == occupation
  def speaksEnglish: Boolean = true

  def &(person: Person): String = s"${this.name} and ${person.name} are colleagues"

  def unary_+(): Person = {
    val newName:String = this.name + " NoSurname"
    val newPerson:Person = new Person(newName)
    newPerson
  }
//  def name(): String = s"${this.name}  "

//  def apply(): String = s"$name works as a $occupation"
}


