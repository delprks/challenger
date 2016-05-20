package challenger.removeDuplicates

class RemoveDuplicatesTest extends org.scalatest.FlatSpec {
  "removeDuplicates" should "remove duplicate words if they exist" in {
    assert("The quick brown fox jumps over the lazy dog" == RemoveDuplicates.removeDuplicates("The quick brown fox jumps over the lazy brown dog"))
  }

  "removeDuplicates" should "return same sentence if there are no duplicates" in {
    assert("The quick brown fox jumps over the lazy dog" == RemoveDuplicates.removeDuplicates("The quick brown fox jumps over the lazy dog"))
  }

  "removeDuplicates" should "remove duplicates when there are three duplicates" in {
    assert("The quick brown fox jumps over the lazy dog" == RemoveDuplicates.removeDuplicates("The quick brown fox jumps over the brown lazy brown dog"))
  }

  "removeDuplicates" should "return empty if sentence is empty" in {
    assert(RemoveDuplicates.removeDuplicates("").isEmpty)
  }
}
