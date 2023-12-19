class Rational(n: Int, d:Int){
    require(d != 0)
    val num: Int = n
    val den: Int = d

    override def toString = s"$num/$den"

    def add(newObj:Rational):Rational =
        new Rational(num*newObj.den+newObj.num*den, den * newObj.den)
    def multiply(newObj:Rational):Rational =
        new Rational(num*newObj.num, den * newObj.den)

}

object Fields extends App {
    val rational1 = new Rational(1,2)
    val rational2 = new Rational(3,4)

    val sum = rational1.add(rational2)
    println(sum)
    val mult = rational1.multiply(rational2)
    println(mult)
}