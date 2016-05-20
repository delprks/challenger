package challenger.PyramidOfSharp

/**
  * Problem: Output a pyramid of # with user specified height into a file
  */
object PyramidBuilder {
  def main(args: Array[String]) = {
    build(3)
  }

  /**
    * """
   #
  ###
 #####
#######
"""
    * @param rows
    * @return
    */
  def build(rows: Int): Unit = for (row <- 1 until rows) {
    for (space <- 0 until (rows - 1)) println(" ")

  }
}

// number of rows + 0 for 1 row
// number of rows + 1 for 2 row
// number of rows + 2 for 3 row
// number of rows + 3 for 4 row
