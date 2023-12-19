error id: file:///D:/VIT%20Bhopal/VS%20Code/Scala/Instance.scala:[6..7) in Input.VirtualFile("file:///D:/VIT%20Bhopal/VS%20Code/Scala/Instance.scala", "class (value: Int) {
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
}")
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Instance.scala
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Instance.scala:1: error: expected identifier; obtained lparen
class (value: Int) {
      ^
#### Short summary: 

expected identifier; obtained lparen