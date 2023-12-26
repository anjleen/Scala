object NestedIteration extends App {
    val matrix = Array.ofDim[Int](3,3)

    for {
        i <- 0 until 3
        j <- 0 until 3
    } {
        matrix(i)(j) = i + j
    }
    for  (row <- matrix) {
        println(row.mkString(", "))
    }
}