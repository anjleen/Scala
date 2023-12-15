import scala.collection.mutable

object setsDemo {
    def main(args: Array[String]): Unit={

        //Creating a mutable set
        val mutableSet: mutable.Set[String] =
            mutable.Set("Apple", "Banana", "Orange")
        for (x <- mutableSet) {
            print(x+" ")
        }
        println()
    }
}