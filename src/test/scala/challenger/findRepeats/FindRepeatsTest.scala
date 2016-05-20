package challenger.findRepeats

class FindRepeatsTest extends org.scalatest.FlatSpec {
  "findUniqueMembers" should "return non-repeated numbers when there are multiple non-repeated numbers" in {
    assert(List(4, 5, 6, 7) == FindRepeats.findUniqueMembers(List(1, 2, 2, 1, 4, 5, 2, 6, 7)))
  }

  "findUniqueMembers" should "return non-repeated number when there is only one non-repeated number" in {
    assert(List(4) == FindRepeats.findUniqueMembers(List(1, 2, 2, 1, 4, 2)))
  }

  "findUniqueMembers" should "return empty list all numbers are repeated" in {
    assert(List() == FindRepeats.findUniqueMembers(List(1, 2, 2, 1, 4, 2, 4)))
  }
}
