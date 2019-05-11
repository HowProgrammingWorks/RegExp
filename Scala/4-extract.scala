package regexp

case class Student(listNumber: Int, firstname: String, lastname: String)

object Extract extends App {
  //Regular expression to parse student data
  val StudentRegexp = "([0-9]+) - ([A-Za-z]+) ([A-Za-z]+)".r

  //Sample text that contains list of students
  val studentsJournal =
    """1 - Pavel Kravec
      |2 - Carl Hewitt
      |3 - Martin Odersky
      |4chan - Oleg Dubynskiy
    """.stripMargin

  //Parsed from input text students
  val students: Array[Student] = studentsJournal.split("\n").flatMap {
    //Use of regular expression as an extractor of groups
    case StudentRegex(listNumber, firstname, lastname) =>
      List(Student(listNumber.toInt, firstname, lastname))
    case _ => Nil
  }

  students.foreach(println)
  /** Output:
    * Student(1,Pavel,Kravec)
    * Student(2,Carl,Hewitt)
    * Student(3,Martin,Odersky)
    *
    * Last student had incorrect listNumber, so he is not present in a result list
  */
}
