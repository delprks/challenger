package challenger.sharedItems

/**
  * Problem: Find shared items between two lists
  */
object SharedItems {
  def main(args: Array[String]) = {
    val lOne: List[String] = List("first", "second", "third")
    val lTwo: List[String] = List("fourth", "second", "first")
    val duplicates = findShared(lOne, lTwo)

    println(s"following items are shared between lists: $duplicates")
  }

  def findShared(lOne: List[String], lTwo: List[String]) = for {
      one <- lOne
      two <- lTwo if one == two
    } yield one
}
