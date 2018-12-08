package regexp

object Replace extends App {
  val rx1 = "abc".r
  val s11 = "abcdefg"
  val s12 = rx1.replaceAllIn(s11, "123")
  print(s12)

  val rx2 = "(?i)abc".r
  val s21 = "abcdefgABCDEFG"
  val s22 = rx1.replaceAllIn(s11, "789")
  print(s22)
}
