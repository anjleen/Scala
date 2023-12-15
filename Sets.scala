object Sets {
    def main(args: Array[String]) : Unit={
        val immutableSet : Set[Int] = Set(7, 22, 93, 53,52 )
        for (x <- immutableSet) {
            print(x+" ")
        }
        println()

        val newSet = immutableSet + 6
        println(newSet)

        val removedSet = immutableSet - 7
        println(removedSet)

        val containElement : Boolean = immutableSet.contains(22)
        println(containElement)


    }
}