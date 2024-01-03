object ListMergingProgram extends App {
    val list1: List[Int] = List(1,2,3,4,5)
    val list2: List[Int] = List(4,5,6,7,8)

    def mergedLists(listA: List[Int], listB: List[Int]): List[Int] = {
        (listA ::: listB).distinct
    }

    val mergedList: List[Int] = mergedLists(list1, list2)
    println(s"Merged List: $mergedList")
}