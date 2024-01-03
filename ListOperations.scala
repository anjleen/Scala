object ElementMatcher extends App {
    val mixedList: List[Any] = List(1, "Scala", true , 3.14, false, "Pattern Matching", 42)

    def matchElements(elements: List[Any]): Unit={
        for (element <- elements) {
            element match {
                case _: Int =>
                    println(s"Found an Integer: $element")
                case _: String =>
                    println(s"Found a String: $element")
                case _: Boolean =>
                    println(s"Found a Boolean: $element")
                case _: Double =>
                    println(s"Found a Double: $element")
                case _ =>
                    println("Found an element of Unknown Type")
            }
        }
    }
    matchElements(mixedList)
}