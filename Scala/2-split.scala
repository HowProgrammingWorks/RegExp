package regexp


object Split extends App {
  val s = "Scala is funnier than Java"
  val words = "\\W+".r split s.toLowerCase

  print(words.mkString("\n"))
}
