error id: file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala:[263..264) in Input.VirtualFile("file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala", "class Rational(n: Int, d:Int){
    require(d != 0)
    val num: Int = n
    val den: Int = d

    override def toString = s"$num/$den"

    def add(newObj:Rational):Rational =
        new Rational(num*newObj.den+newObj.num*den, den * newObj.den)
    def (newObj:Rational):Rational =
        new Rational(num*newObj.num, den * newObj.den)

}

object Fields extends App {
    val rational1 = new Rational(1,2)
    val rational2 = new Rational(3,4)

    val sum = rational1.add(rational2)
    println(sum)
}")
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala:10: error: expected identifier; obtained lparen
    def (newObj:Rational):Rational =
        ^
#### Short summary: 

expected identifier; obtained lparen