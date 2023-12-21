error id: file:///D:/VIT%20Bhopal/VS%20Code/Scala/GCD.scala:[467..467) in Input.VirtualFile("file:///D:/VIT%20Bhopal/VS%20Code/Scala/GCD.scala", "class Rationalll(n: Int, d: Int) {
    require (d!=0)

    private val g = gcd(n.abs, d.abs)
    val num = n/g
    val den = d/g

    def this(n:Int) = this(n, 1)

    def add(newObj: Rationalll): Rationalll = 
        new Rationalll(num*newObj.den + newObj.num * den, den * newObj.den)

    override def toString: String = s"$num/$den"

    Private def gcd(a:Int, b: Int): Int = {
        if (b==0) abstract class else gcd(b, a%b)
    }
}

object ")
file:///D:/VIT%20Bhopal/VS%20Code/Scala/GCD.scala
file:///D:/VIT%20Bhopal/VS%20Code/Scala/GCD.scala:20: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof