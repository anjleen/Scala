class Rationalll(n: Int, d: Int) {
    require (d!=0)

    private val g = gcd(n.abs, d.abs)
    val num = n/g
    val den = d/g

    def this(n:Int) = this(n, 1)

    def +(newObj: Rationalll): Rationalll = 
        new Rationalll(num*newObj.den + newObj.num * den, den * newObj.den)

    override def toString: String = s"$num/$den"

    private def gcd(a:Int, b: Int): Int = {
        if (b==0) a
        else gcd(b, a%b)
    }
}

object Demo extends App {
    val Rational1 = new Rationalll(78, 49)
    val Rational2 = new Rationalll(56, 90)

    val sum = Rational1+Rational2
    print(sum.toString)
}