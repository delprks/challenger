package challenger.sharedItems

class SharedItemsTest extends org.scalatest.FlatSpec {
  "findShared" should "return list of shared items between two lists" in {
    val lOne: List[String] = List("first", "second", "third")
    val lTwo: List[String] = List("fourth", "second", "first")

    assert(List("first", "second") == SharedItems.findShared(lOne, lTwo))
  }

  "findShared" should "return list of shared items between two lists when only one item is shared" in {
    val lOne: List[String] = List("second", "third")
    val lTwo: List[String] = List("fourth", "second", "first")

    assert(List("second") == SharedItems.findShared(lOne, lTwo))
  }

  "findShared" should "return an empty list when there are no shared items" in {
    val lOne: List[String] = List("second", "third")
    val lTwo: List[String] = List("fourth")

    assert(List() == SharedItems.findShared(lOne, lTwo))
  }

  "findShared" should "return an empty list when one of the lists is empty" in {
    val lOne: List[String] = List("second", "third")
    val lTwo: List[String] = List()

    assert(List() == SharedItems.findShared(lOne, lTwo))
  }

  "findShared" should "return an empty list when both lists are empty" in {
    val lOne: List[String] = List()
    val lTwo: List[String] = List()

    assert(List() == SharedItems.findShared(lOne, lTwo))
  }
}
