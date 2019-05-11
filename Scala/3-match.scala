package regexp

object Match extends App {
  val s = "Hello user1@domain.com and user2@domain.com"
  val rx: Regex = "\\S+@[\\S.]+".r

  val firstMatch: Option[Regex.Match] = rx.findFirstMatchIn(s)
  val allMatches: Iterator[Regex.Match] = rx.findAllMatchIn(s)

  firstMatch.map(_.group(0)).foreach(println)
  allMatches.map(_.group(0)).foreach(println)
}