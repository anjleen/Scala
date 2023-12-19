class Rational(n : Int,d : Int){
    require(d!=0)
    override def toString = s"$n/$d"
    // println("Created"+n+"/"+d)
}
object  Rational_Constructor{
    def main(args : Array[String])={
        val x = new Rational(5,2)
        println(x.toString)
    }
}