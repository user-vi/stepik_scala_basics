package lectures.week2oop


object ClassesOOP extends App {
  val student = new Instructor(0, "bob", "smith")
//  println(student.fullName)

  val course = new Course(1, "title", "2020", student)
  println(course.getID())
  println(course.isTaughtBy(student))
  println((course.copyCourse("2021")).releaseYear)
}

class Instructor(val id: Int, val name: String, val surname: String) {

  def correctCaseOfName(name: String): String = {
    val initName = name.charAt(0).toUpper
    val other = name.substring(1).toLowerCase
    val result = initName +: other
    result
  }

  def fullName(): String = {
    val name = correctCaseOfName(this.name)
    val surname = correctCaseOfName(this.surname)
    s"$name $surname"
  }
}

class Course(val courseId: Int, val title: String, val releaseYear: String, val instructor: Instructor) {

  def getID(): String = {
    this.courseId.toString :++ this.instructor.id.toString
  }

  def isTaughtBy(instructor: Instructor): Boolean = {
    instructor.id == this.instructor.id
  }

  def copyCourse(newReleaseYear: String): Course = {
    new Course(this.courseId, this.title, newReleaseYear, this.instructor)
  }
}

