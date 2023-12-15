object Lists01 {
    def main(args:Array[String]):  Unit={
        val fruit: List[String] = List("Apples", "Banana", "Orange")
        
        val FirstElement: String = fruit.head
        println("First Element is: "+FirstElement)

        val restofList: List[String] = fruit.tail
        println("Rest of the elements in list are: "+restofList)

        val checkEmpty: Boolean = fruit.isEmpty
        println("Is the list empty: "+checkEmpty)
    }
}