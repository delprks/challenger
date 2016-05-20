package challenger.findRepeats

/**
  * Problem: Given an array where all numbers except one are repeated, find the number that only occurs once
  */
object FindRepeats {
  def main(args: Array[String]) = {
    val numList: List[Int] = List(2, 2, 3, 3, 5, 6, 5, 5)
    val notRepeated: List[Int] = findUniqueMembers(numList)

    println(s"Following item(s) are not repeated: $notRepeated")
  }

  def findUniqueMembers(numList: List[Int]): List[Int] = for {
      num <- numList if numList.count(_ == num) == 1
    } yield num
}
