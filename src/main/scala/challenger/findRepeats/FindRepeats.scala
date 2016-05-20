package challenger.findRepeats

object FindRepeats {
  def main(args: Array[String]) = {
    val numList: List[Int] = List(2, 2, 3, 3, 5, 6, 5, 5)

    val notRepeated: List[Int] = for {
      num <- numList if numList.count(_ == num) == 1
    } yield num

    println(s"Following item(s) are not repeated: $notRepeated")
  }
}
