package challenger.removeDuplicates

/**
  * Problem: Remove duplicate words
  */
object RemoveDuplicates {
  def main(args: Array[String]) = {
    val sentence = "The quick brown fox jumps over the lazy brown dog"

    println(removeDuplicates(sentence))
  }

  def removeDuplicates(sentence: String): String = sentence.split(" ").distinct.mkString(" ")
}
