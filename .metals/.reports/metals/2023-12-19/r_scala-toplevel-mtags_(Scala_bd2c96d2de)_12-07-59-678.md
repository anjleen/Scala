error id: file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala:[270..277) in Input.VirtualFile("file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala", "class Rational(n: Int, d:Int){
    require(d != 0)
    val num: Int = n
    val den: Int = d

    override def toString = s"$num/$den"

    def add(newObj:Rational):Rational =
        new Rational(num*newObj.den+newObj.num*den, den * newObj.den)

}

object  extends App {
    val rational1 = new Rational(1,2)
    val rational2 = new Rational(3,4)

    val sum = rational1.add(rational2)
    println(sum)
}")
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala:13: error: expected identifier; obtained extends
object  extends App {
        ^
#### Short summary: 

expected identifier; obtained extends