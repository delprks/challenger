package challenger.PyramidOfSharp

class PyramidBuilderTest extends org.scalatest.FlatSpec {
  "build" should "build a pyramid if three rows are requested" in {
    assert(
"""
  #
 ###
#####
""".stripMargin == PyramidBuilder.build(3))
  }
}
