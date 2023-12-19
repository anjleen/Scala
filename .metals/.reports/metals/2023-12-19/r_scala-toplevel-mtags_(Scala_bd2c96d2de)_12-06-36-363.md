error id: file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala:[269..269) in Input.VirtualFile("file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala", "class Rational(n: Int, d:Int){
    require(d != 0)
    val num: Int = n
    val den: Int = d

    override def toString = s"$num/$den"

    def add(newObj:Rational):Rational =
        new Rational(num*newObj.den+newObj.num*den, den * newObj.den)

}

object ")
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala
file:///D:/VIT%20Bhopal/VS%20Code/Scala/Fields.scala:13: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof