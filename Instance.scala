class MyClass(value: Int) {
    val myValue: Int = value

    def printValue(): Unit={
        println(s"Value in this instance: $myValue")
    }

    def isSameValue(myValue: Int): Boolean = {
        this.myValue == myValue
    }
}

object Main extends App {
    val myObject = new MyClass(42)

    myObject.printValue()

    val res = myObject.isSameValue(40)
    println(s"Is it the same value? $res")
}